package com.trinitarias.Spotifyform.dt;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public class FormularioUserDto {
	private DatosPersonalesDto datospersonales;
	private DatosContactoDto datoscontacto;
	private DatosDirecciónDto datosdireccion;
	private DatosProductos datosproductos;
	private DatosPagodt datospagos;
	
	public DatosPersonalesDto getDatospersonales() {
		return datospersonales;
	}
	public void setDatospersonales(DatosPersonalesDto datospersonales) {
		this.datospersonales = datospersonales;
	}
	public DatosContactoDto getDatoscontacto() {
		return datoscontacto;
	}
	public void setDatoscontacto(DatosContactoDto datoscontacto) {
		this.datoscontacto = datoscontacto;
	}
	public DatosDirecciónDto getDatosdireccion() {
		return datosdireccion;
	}
	public void setDatosdireccion(DatosDirecciónDto datosdireccion) {
		this.datosdireccion = datosdireccion;
	}
	public DatosProductos getDatosproductos() {
		return datosproductos;
	}
	public void setDatosproductos(DatosProductos datosproductos) {
		this.datosproductos = datosproductos;
	}
	public DatosPagodt getDatospagos() {
		return datospagos;
	}
	public void setDatospagos(DatosPagodt datospagos) {
		this.datospagos = datospagos;
	}
	
	
	
	
}
