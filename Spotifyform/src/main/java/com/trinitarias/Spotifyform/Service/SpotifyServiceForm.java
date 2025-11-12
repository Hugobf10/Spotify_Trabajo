package com.trinitarias.Spotifyform.Service;
import java.util.ArrayList;

import com.trinitarias.Spotifyform.dt.*;
public class SpotifyServiceForm {
	ArrayList<FormularioUserDto> form=new ArrayList();
	
	//crear
	public FormularioUserDto crear(FormularioUserDto formulario){
		form.add(formulario);
		return formulario;
	}
	//Actualizar
	public FormularioUserDto actualizar(FormularioUserDto formulario) {
		
		return formulario;
	}
	
}
