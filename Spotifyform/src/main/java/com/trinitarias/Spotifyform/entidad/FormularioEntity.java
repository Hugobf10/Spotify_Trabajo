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

    @Column(name = "nombre", nullable = false, length = 60)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "genero", length = 20)
    private String genero;

    @Column(name = "nacionalidad", length = 50)
    private String nacionalidad;

    @Column(name = "tipo_identificacion", length = 20)
    private String tipoIdentificacion;

    @Column(name = "numero_identificacion", nullable = false, unique = true, length = 20)
    private String numeroIdentificacion;

    @Column(name = "estado_civil", length = 30)
    private String estadoCivil;

    // ======== DATOS DE CONTACTO ========

    @Column(name = "telefono_movil", length = 15)
    private String telefonoMovil;

    @Column(name = "telefono_fijo", length = 15)
    private String telefonoFijo;

    @Column(name = "correo_electronico", nullable = false, unique = true, length = 100)
    private String correoElectronico;

    @Column(name = "perfil_linkedin", length = 255)
    private String perfilLinkedIn;

    @Column(name = "perfil_twitter", length = 255)
    private String perfilTwitter;

    @Column(name = "sitio_web_personal", length = 255)
    private String sitioWebPersonal;

    // ======== DIRECCIÓN ========

    @Column(name = "tipo_via", length = 30)
    private String tipoVia;

    @Column(name = "via", length = 100)
    private String via;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "piso", length = 10)
    private String piso;

    @Column(name = "puerta", length = 10)
    private String puerta;

    @Column(name = "tipo_vivienda", length = 30)
    private String tipoVivienda;

    @Column(name = "codigo_postal", length = 10)
    private String codigoPostal;

    @Column(name = "provincia", length = 50)
    private String provincia;

    @Column(name = "localidad", length = 50)
    private String localidad;

    @Column(name = "pais", length = 50)
    private String pais;

    // ======== PRODUCTO PRINCIPAL ========

    @Column(name = "producto_principal", nullable = false, length = 30)
    private String productoPrincipal;

    // ======== PRODUCTOS SECUNDARIOS ========
    @ElementCollection
    @CollectionTable(name = "productos_secundarios",
                     joinColumns = @JoinColumn(name = "formulario_id"))
    @Column(name = "producto", length = 50)
    private List<String> productosSecundarios;

    // ======== MÉTODO DE PAGO ========

    @Column(name = "tipo_pago", length = 30)
    private String tipoPago;

    @Column(name = "nombre_titular", length = 100)
    private String nombreTitular;

    @Column(name = "fecha_caducidad", length = 10)
    private String fechaCaducidad;

    @Column(name = "codigo_seguridad", length = 5)
    private String codigoSeguridad;

    // ======== DATOS BANCARIOS ========

    @Column(name = "nombre_banco", length = 100)
    private String nombreBanco;

    @Column(name = "numero_cuenta", length = 34) // IBAN máx 34 caracteres
    private String numeroCuenta;

    @Column(name = "swift_bic", length = 11)
    private String swiftBic;

    @Column(name = "tipo_cuenta", length = 20)
    private String tipoCuenta;

    @Column(name = "sucursal", length = 100)
    private String sucursal;

    // ======== CONSTRUCTORES ========

    public FormularioEntity() {}

    // ======== GETTERS Y SETTERS ========

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getTipoIdentificacion() { return tipoIdentificacion; }
    public void setTipoIdentificacion(String tipoIdentificacion) { this.tipoIdentificacion = tipoIdentificacion; }

    public String getNumeroIdentificacion() { return numeroIdentificacion; }
    public void setNumeroIdentificacion(String numeroIdentificacion) { this.numeroIdentificacion = numeroIdentificacion; }

    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    public String getTelefonoMovil() { return telefonoMovil; }
    public void setTelefonoMovil(String telefonoMovil) { this.telefonoMovil = telefonoMovil; }

    public String getTelefonoFijo() { return telefonoFijo; }
    public void setTelefonoFijo(String telefonoFijo) { this.telefonoFijo = telefonoFijo; }

    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getPerfilLinkedIn() { return perfilLinkedIn; }
    public void setPerfilLinkedIn(String perfilLinkedIn) { this.perfilLinkedIn = perfilLinkedIn; }

    public String getPerfilTwitter() { return perfilTwitter; }
    public void setPerfilTwitter(String perfilTwitter) { this.perfilTwitter = perfilTwitter; }

    public String getSitioWebPersonal() { return sitioWebPersonal; }
    public void setSitioWebPersonal(String sitioWebPersonal) { this.sitioWebPersonal = sitioWebPersonal; }

    public String getTipoVia() { return tipoVia; }
    public void setTipoVia(String tipoVia) { this.tipoVia = tipoVia; }

    public String getVia() { return via; }
    public void setVia(String via) { this.via = via; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getPiso() { return piso; }
    public void setPiso(String piso) { this.piso = piso; }

    public String getPuerta() { return puerta; }
    public void setPuerta(String puerta) { this.puerta = puerta; }

    public String getTipoVivienda() { return tipoVivienda; }
    public void setTipoVivienda(String tipoVivienda) { this.tipoVivienda = tipoVivienda; }

    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getLocalidad() { return localidad; }
    public void setLocalidad(String localidad) { this.localidad = localidad; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getProductoPrincipal() { return productoPrincipal; }
    public void setProductoPrincipal(String productoPrincipal) { this.productoPrincipal = productoPrincipal; }

    public List<String> getProductosSecundarios() { return productosSecundarios; }
    public void setProductosSecundarios(List<String> productosSecundarios) { this.productosSecundarios = productosSecundarios; }

    public String getTipoPago() { return tipoPago; }
    public void setTipoPago(String tipoPago) { this.tipoPago = tipoPago; }

    public String getNombreTitular() { return nombreTitular; }
    public void setNombreTitular(String nombreTitular) { this.nombreTitular = nombreTitular; }

    public String getFechaCaducidad() { return fechaCaducidad; }
    public void setFechaCaducidad(String fechaCaducidad) { this.fechaCaducidad = fechaCaducidad; }

    public String getCodigoSeguridad() { return codigoSeguridad; }
    public void setCodigoSeguridad(String codigoSeguridad) { this.codigoSeguridad = codigoSeguridad; }

    public String getNombreBanco() { return nombreBanco; }
    public void setNombreBanco(String nombreBanco) { this.nombreBanco = nombreBanco; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public String getSwiftBic() { return swiftBic; }
    public void setSwiftBic(String swiftBic) { this.swiftBic = swiftBic; }

    public String getTipoCuenta() { return tipoCuenta; }
    public void setTipoCuenta(String tipoCuenta) { this.tipoCuenta = tipoCuenta; }

    public String getSucursal() { return sucursal; }
    public void setSucursal(String sucursal) { this.sucursal = sucursal; }
}

