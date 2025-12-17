package com.trinitarias.Spotifyform.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import com.trinitarias.Spotifyform.dt.FormularioUserDto;


@Component
public class SpotifyValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return FormularioUserDto.class.isAssignableFrom(clazz);
	}
	public void campobligatorio(String get,String ruta,Errors errors) {
		if(get.isBlank()) {
			errors.rejectValue(ruta, "i18n.", "el campo es obligatorio");
		}
	}
	public void minimo(String get,String ruta,int numero, Errors errors) {
		if(get.length()<numero) {
			errors.rejectValue(ruta, "i18n.", "el campo no puede ser menor que "+numero+"caracteres");
		}
	}
	public void maximo(String get,String ruta,int numero, Errors errors) {
		if(get.length()>numero) {
			errors.rejectValue(ruta, "i18n.", "el campo no puede ser mayor que "+numero+"caracteres");
		}
	}
	public void validardni(String get,String ruta, Errors errors) {
		if (!get.matches("\\d{8}[A-Za-z]")) {
		    errors.rejectValue(ruta, "i18n.", "El campo tiene que ser si o si un DNI");
		}

	}
	public void validarIBAN(String get, String ruta, Errors errors) {
	    if (!get.matches("^ES\\d{22}$")) {
	        errors.rejectValue(ruta, "i18n", "El IBAN debe empezar por ES y tener 22 dígitos más.");
	    }
	}
	public void validarCorreo(String get, String ruta, Errors errors) {
	    if (!get.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
	        errors.rejectValue(ruta, "i18n", "Formato de correo inválido.");
	    }
	}



	@Override
	public void validate(Object target, Errors errors) {
		FormularioUserDto formAValidar=(FormularioUserDto) target;
		//-----------------DATOS PERSONALES--------------------------------------------------------------------------------
		validarDatosPersonales(errors, formAValidar);
		//----------------DATOS DE CONTACTO---------------------------------------------------------------------------------
		datosDeContacto(errors, formAValidar);
		
		//----------------DATOS DE DIRECCIÓN---------------------------------------------------------------------------------
		validarDatosDireccion(errors, formAValidar);
		//--------------DATOS DE PRODUCTOS-------------------------------------------------------------------------------------
		campobligatorio(formAValidar.getDatosproductos().getProductoPrincipal(),"datosDireccion.productoPrincipal",errors);
		//--------------DATOS DE PAGO------------------------------------------------------------------------------------------
		validarDatosDePago(errors, formAValidar);
		

		
		
		// TODO Auto-generated method stub

	}
	private void validarDatosDePago(Errors errors, FormularioUserDto formAValidar) {
		validarTipoCuenta(errors, formAValidar);
		validarTipoDePago(errors, formAValidar);
		validarNombreTitular(errors, formAValidar);
		validarFechaCaducidad(errors, formAValidar);
		validarCodigoSeguridad(errors, formAValidar);
		validarNombreBanco(errors, formAValidar);
		validarNumeroCuenta(errors, formAValidar);
		validarSwift(errors, formAValidar);
		validarSucursal(errors, formAValidar);
	}
	private void validarSucursal(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getSucursal(),"datospagos.sucursal",errors);
	}
	private void validarSwift(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getSwiftBic(),"datospagos.swiftBic",errors);
	}
	private void validarNumeroCuenta(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getNumeroCuenta(),"datospagos.numeroCuenta",errors);
		validarIBAN(formAValidar.getDatospagos().getNumeroCuenta(),"datospagos.numeroCuenta",errors);
	}
	private void validarNombreBanco(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getNombreBanco(),"datospagos.nombreBanco",errors);
		maximo(formAValidar.getDatospagos().getNombreBanco(),"datospagos.nombreBanco",10,errors);
	}
	private void validarCodigoSeguridad(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getCodigoSeguridad(),"datospagos.codigoSeguridad",errors);
		maximo(formAValidar.getDatospagos().getCodigoSeguridad(),"datospagos.codigoSeguridad",4,errors);
	}
	private void validarFechaCaducidad(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getFechaCaducidad(),"datospagos.fechaCaducidad",errors);
	}
	private void validarNombreTitular(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getNombreTitular(),"datospagos.nombreTitular",errors);
		maximo(formAValidar.getDatospagos().getNombreTitular(),"datospagos.nombreTitular",16,errors);
	}
	private void validarTipoDePago(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getTipoPago(),"datospagos.tipoPago",errors);
		maximo(formAValidar.getDatospagos().getTipoPago(),"datospagos.tipoPago",13,errors);
	}
	private void validarTipoCuenta(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospagos().getTipoCuenta(),"datosDireccion.tipoCuenta",errors);
		maximo(formAValidar.getDatospagos().getTipoCuenta(),"datosDireccion.tipoCuenta",9,errors);
	}
	//----------------DATOS DE DIRECCIÓN---------------------------------------------------------------------------------
	private void validarDatosDireccion(Errors errors, FormularioUserDto formAValidar) {
		validarLocalidad(errors, formAValidar);
		validarVia(errors, formAValidar);
		validarTipoVia(errors, formAValidar);
		validarCodPostal(errors, formAValidar);
		validarNumero(errors, formAValidar);
		validarProvincia(errors, formAValidar);
		validarPais(errors, formAValidar);
	}
	private void validarPais(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getPais(),"datosdireccion.pais",errors);
	}
	private void validarProvincia(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getProvincia(),"datosdireccion.provincia",errors);
	}
	private void validarNumero(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getNumero(),"datosdireccion.numero",errors);
	}
	private void validarCodPostal(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getCodigoPostal(),"datosdireccion.codigoPostal",errors);
		maximo(formAValidar.getDatosdireccion().getCodigoPostal(),"datosdireccion.codigoPostal",7,errors);
	}
	private void validarVia(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getVia(),"datosdireccion.via",errors);
	}
	private void validarLocalidad(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getLocalidad(),"datosdireccion.localidad",errors);
	}
	private void validarTipoVia(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatosdireccion().getTipoVia(),"datosdireccion.tipoVia",errors);
		maximo(formAValidar.getDatosdireccion().getTipoVia(),"datosdireccion.tipoVia",9,errors);
	}
	//----------------DATOS DE CONTACTO---------------------------------------------------------------------------------
	private void datosDeContacto(Errors errors, FormularioUserDto formAValidar) {
		validarCorreoElectronico(errors, formAValidar);
		validarTelefonoMovil(errors, formAValidar);
	}
	private void validarCorreoElectronico(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatoscontacto().getCorreoElectronico(),"datoscontacto.correoElectronico",errors);
		validarCorreo(formAValidar.getDatoscontacto().getCorreoElectronico(),"datoscontacto.correoElectronico",errors);
	}
	private void validarTelefonoMovil(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatoscontacto().getTelefonoMovil(),"datoscontacto.telefonoMovil",errors);
		minimo(formAValidar.getDatoscontacto().getTelefonoMovil(),"datoscontacto.telefonoMovil",9,errors);
	}
	
	//-----------------DATOS PERSONALES--------------------------------------------------------------------------------
	private void validarDatosPersonales(Errors errors, FormularioUserDto formAValidar) {
		validarNombre(errors, formAValidar);
		validarApellidos(errors, formAValidar);
		validarGenero(errors, formAValidar);
		validarNacionalidad(errors, formAValidar);
		validarTipoIdentificacion(errors, formAValidar);
		validarDni(errors, formAValidar);
		validarEstadoCivil(errors, formAValidar);
	}
	private void validarEstadoCivil(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getEstadoCivil(),"datospersonales.estadoCivil",errors);
	}
	private void validarNacionalidad(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getNacionalidad(),"datospersonales.nacionalidad",errors);
	}
	private void validarDni(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getNumeroIdentificacion(),"datospersonales.numeroIdentificacion",errors);
		validardni(formAValidar.getDatospersonales().getNumeroIdentificacion(),"datospersonales.numeroIdentificacion",errors);
	}
	private void validarTipoIdentificacion(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getTipoIdentificacion(),"datospersonales.tipoIdentificacion",errors);
		maximo(formAValidar.getDatospersonales().getTipoIdentificacion(),"datospersonales.tipoIdentificacion",9,errors);
	}
	private void validarGenero(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getGenero(),"datospersonales.genero",errors);
		maximo(formAValidar.getDatospersonales().getGenero(),"datospersonales.genero",9,errors);
	}
	private void validarApellidos(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getApellidos(),"datospersonales.apellidos",errors);
		campobligatorio(formAValidar.getDatospersonales().getApellidos(),"datospersonales.apellidos",errors);
	}
	private void validarNombre(Errors errors, FormularioUserDto formAValidar) {
		campobligatorio(formAValidar.getDatospersonales().getNombre(),"datospersonales.nombre",errors);
	}
	

}

