package com.trinitarias.Spotifyform.dt;

public class DatosPagodt {
    // ===== 6. Método de pago =====
    private String tipoPago; // Desplegable (solo transferencia)
    private String nombreTitular;
    private String fechaCaducidad; // Solo para tarjetas
    private String codigoSeguridad; // CVV

    // ===== 7. Datos bancarios =====
    private String nombreBanco;
    private String numeroCuenta; // IBAN
    private String swiftBic;
    private String tipoCuenta; // corriente, ahorro
    private String sucursal;
    
	public DatosPagodt(String tipoPago, String nombreTitular, String fechaCaducidad, String codigoSeguridad,
			String nombreBanco, String numeroCuenta, String swiftBic, String tipoCuenta, String sucursal) {
		super();
		this.tipoPago = tipoPago;
		this.nombreTitular = nombreTitular;
		this.fechaCaducidad = fechaCaducidad;
		this.codigoSeguridad = codigoSeguridad;
		this.nombreBanco = nombreBanco;
		this.numeroCuenta = numeroCuenta;
		this.swiftBic = swiftBic;
		this.tipoCuenta = tipoCuenta;
		this.sucursal = sucursal;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}
	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
	public String getNombreBanco() {
		return nombreBanco;
	}
	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getSwiftBic() {
		return swiftBic;
	}
	public void setSwiftBic(String swiftBic) {
		this.swiftBic = swiftBic;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	public String getSucursal() {
		return sucursal;
	}
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
    
}
