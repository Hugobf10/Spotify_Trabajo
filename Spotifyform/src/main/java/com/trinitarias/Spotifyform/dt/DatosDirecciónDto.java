package com.trinitarias.Spotifyform.dt;

public class DatosDirecciónDto {
    private String tipoVia; // Desplegable
    private String via;
    private String numero;
    private String piso;
    private String puerta;
    private String tipoVivienda; // Desplegable (piso, casa, chalet)
    private String codigoPostal;
    private String provincia; // Desplegable
    private String localidad;
    private String pais;
    
	public DatosDirecciónDto(String tipoVia, String via, String numero, String piso, String puerta, String tipoVivienda,
			String codigoPostal, String provincia, String localidad, String pais) {
		super();
		this.tipoVia = tipoVia;
		this.via = via;
		this.numero = numero;
		this.piso = piso;
		this.puerta = puerta;
		this.tipoVivienda = tipoVivienda;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.localidad = localidad;
		this.pais = pais;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	public String getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
    
}
