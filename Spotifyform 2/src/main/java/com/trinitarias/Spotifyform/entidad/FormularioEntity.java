package com.trinitarias.Spotifyform.entidad;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "formularios")
public class FormularioEntity {

    // ======== ID ========
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // ======== DATOS PERSONALES ========

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "genero")
    private String genero;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "tipo_identificacion")
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "estado_civil")
    private String estadoCivil;

    // ======== DATOS DE CONTACTO ========

    @Column(name = "telefono_movil")
    private String telefonoMovil;

    @Column(name = "telefono_fijo")
    private String telefonoFijo;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @Column(name = "perfil_linkedin")
    private String perfilLinkedIn;

    @Column(name = "perfil_twitter")
    private String perfilTwitter;

    @Column(name = "sitio_web_personal")
    private String sitioWebPersonal;

    // ======== DIRECCIÓN ========

    @Column(name = "tipo_via")
    private String tipoVia;

    @Column(name = "via")
    private String via;

    @Column(name = "numero")
    private String numero;

    @Column(name = "piso")
    private String piso;

    @Column(name = "puerta")
    private String puerta;

    @Column(name = "tipo_vivienda")
    private String tipoVivienda;

    @Column(name = "codigo_postal")
    private String codigoPostal;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "pais")
    private String pais;

    // ======== PRODUCTO PRINCIPAL ========

    @Column(name = "producto_principal")
    private String productoPrincipal;

    // ======== PRODUCTOS SECUNDARIOS ========
    @ElementCollection
    @CollectionTable(name = "productos_secundarios",
                     joinColumns = @JoinColumn(name = "formulario_id"))
    @Column(name = "producto")
    private List<String> productosSecundarios;

    // ======== MÉTODO DE PAGO ========

    @Column(name = "tipo_pago")
    private String tipoPago;

    @Column(name = "nombre_titular")
    private String nombreTitular;

    @Column(name = "fecha_caducidad")
    private String fechaCaducidad;

    @Column(name = "codigo_seguridad")
    private String codigoSeguridad;

    // ======== DATOS BANCARIOS ========

    @Column(name = "nombre_banco")
    private String nombreBanco;

    @Column(name = "numero_cuenta") // IBAN máx 34 caracteres
    private String numeroCuenta;

    @Column(name = "swift_bic")
    private String swiftBic;

    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(name = "sucursal")
    private String sucursal;

    // ======== CONSTRUCTORES ========

    public FormularioEntity() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
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

	public String getProductoPrincipal() {
		return productoPrincipal;
	}

	public void setProductoPrincipal(String productoPrincipal) {
		this.productoPrincipal = productoPrincipal;
	}

	public List<String> getProductosSecundarios() {
		return productosSecundarios;
	}

	public void setProductosSecundarios(List<String> productosSecundarios) {
		this.productosSecundarios = productosSecundarios;
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

    // ======== GETTERS Y SETTERS ========
    

}