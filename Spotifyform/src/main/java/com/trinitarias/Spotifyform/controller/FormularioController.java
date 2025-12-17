package com.trinitarias.Spotifyform.controller;


import com.trinitarias.Spotifyform.dt.FormularioUserDto;
import com.trinitarias.Spotifyform.validator.SpotifyValidator;
import com.trinitarias.Spotifyform.Service.SpotifyServiceForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formulario")
@CrossOrigin("*") // para permitir peticiones desde el front
public class FormularioController {

    private final SpotifyServiceForm service;
    @Autowired
    SpotifyValidator validador;
    

    public FormularioController(SpotifyServiceForm service) {
        this.service = service;
    }

    // ======== CREAR ========
    @PostMapping
    public ResponseEntity<?> crear(@RequestBody FormularioUserDto dto, Errors errors) {
    	validador.validate(dto,errors);
    	if(errors.hasErrors()) {
    		return ResponseEntity
    				.status(HttpStatus.BAD_REQUEST)
    				.body(errors.getAllErrors());
    	}
        service.crearFormulario(dto);
        
        return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(dto);
    }

    // ======== OBTENER POR ID ======== 
    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerPorId(@PathVariable Long id) {
    	FormularioUserDto dto=service.obtenerPorId(id);
    	if(dto==null) {
        return ResponseEntity
        		.status(HttpStatus.NOT_FOUND)
        		.body("No existe el formulario con la ID"+id);
    	}
        return ResponseEntity.ok(dto);
    }

    // ======== LISTAR TODOS ========
    @GetMapping
    public ResponseEntity<?> listarTodos() {
    	List<FormularioUserDto> dto=service.listarTodos();
    	if(dto==null) {
        return ResponseEntity
        		.status(HttpStatus.NOT_FOUND)
        		.body("No existe ningun formulario todavia");
    	}
        return ResponseEntity.ok(dto);
    }

    // ======== ACTUALIZAR ========
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody FormularioUserDto dto, Errors errors) {
    	validador.validate(dto,errors);
    	if(errors.hasErrors()) {
    		return ResponseEntity
    				.status(HttpStatus.BAD_REQUEST)
    				.body(errors.getAllErrors());
    	}
        service.actualizar(id, dto);
        
        return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(dto);
    }

    // ======== ELIMINAR ========
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id) {
    	FormularioUserDto dto=service.obtenerPorId(id);
    	if(dto==null) {
        return ResponseEntity
        		.status(HttpStatus.NOT_FOUND)
        		.body("No existe el formulario con la ID"+id);
    	}
    	service.eliminar(id);
        return ResponseEntity.ok(dto);
    }
    
}
