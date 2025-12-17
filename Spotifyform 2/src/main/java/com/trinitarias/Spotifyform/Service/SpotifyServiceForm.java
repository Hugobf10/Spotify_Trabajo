package com.trinitarias.Spotifyform.Service;

import com.trinitarias.Spotifyform.dt.FormularioUserDto;
import java.util.List;

public interface SpotifyServiceForm {

    FormularioUserDto crearFormulario(FormularioUserDto dto);

    FormularioUserDto obtenerPorId(Long id);

    List<FormularioUserDto> listarTodos();

    FormularioUserDto actualizar(Long id, FormularioUserDto dto);

    void eliminar(Long id);
}

