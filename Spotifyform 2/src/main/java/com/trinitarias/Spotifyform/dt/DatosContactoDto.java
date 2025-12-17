package com.trinitarias.Spotifyform.dt;

public class DatosContactoDto {
    private String telefonoMovil;
    private String telefonoFijo;
    private String correoElectronico;
    private String perfilLinkedIn;
    private String perfilTwitter;
    private String sitioWebPersonal;
    
	public DatosContactoDto(String telefonoMovil, String telefonoFijo, String correoElectronico, String perfilLinkedIn,
			String perfilTwitter, String sitioWebPersonal) {
		super();
		this.telefonoMovil = telefonoMovil;
		this.telefonoFijo = telefonoFijo;
		this.correoElectronico = correoElectronico;
		this.perfilLinkedIn = perfilLinkedIn;
		this.perfilTwitter = perfilTwitter;
		this.sitioWebPersonal = sitioWebPersonal;
	}
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getPerfilLinkedIn() {
		return perfilLinkedIn;
	}
	public void setPerfilLinkedIn(String perfilLinkedIn) {
		this.perfilLinkedIn = perfilLinkedIn;
	}
	public String getPerfilTwitter() {
		return perfilTwitter;
	}
	public void setPerfilTwitter(String perfilTwitter) {
		this.perfilTwitter = perfilTwitter;
	}
	public String getSitioWebPersonal() {
		return sitioWebPersonal;
	}
	public void setSitioWebPersonal(String sitioWebPersonal) {
		this.sitioWebPersonal = sitioWebPersonal;
	}
    
}
