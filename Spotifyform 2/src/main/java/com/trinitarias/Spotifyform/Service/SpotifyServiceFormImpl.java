package com.trinitarias.Spotifyform.Service;

import com.trinitarias.Spotifyform.dt.*;
import com.trinitarias.Spotifyform.entidad.FormularioEntity;
import com.trinitarias.Spotifyform.repo.FormularioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpotifyServiceFormImpl implements SpotifyServiceForm {

    private final FormularioRepository repository;

    public SpotifyServiceFormImpl(FormularioRepository repository) {
        this.repository = repository;
    }

    // ============================================================
    // CREAR FORMULARIO (DTO → ENTITY)
    // ============================================================
    @Override
    public FormularioUserDto crearFormulario(FormularioUserDto dto) {

        FormularioEntity entity = new FormularioEntity();

        // ===== DATOS PERSONALES =====
        DatosPersonalesDto dp = dto.getDatospersonales();
        if(dp!= null) {
        entity.setNombre(dp.getNombre());
        entity.setApellidos(dp.getApellidos());
        entity.setFechaNacimiento(dp.getFechaNacimiento());
        entity.setGenero(dp.getGenero());
        entity.setNacionalidad(dp.getNacionalidad());
        entity.setTipoIdentificacion(dp.getTipoIdentificacion());
        entity.setNumeroIdentificacion(dp.getNumeroIdentificacion());
        entity.setEstadoCivil(dp.getEstadoCivil());
        }

        // ===== DATOS CONTACTO =====
        DatosContactoDto dc = dto.getDatoscontacto();
        if(dc!=null) {
        entity.setTelefonoMovil(dc.getTelefonoMovil());
        entity.setTelefonoFijo(dc.getTelefonoFijo());
        entity.setCorreoElectronico(dc.getCorreoElectronico());
        entity.setPerfilLinkedIn(dc.getPerfilLinkedIn());
        entity.setPerfilTwitter(dc.getPerfilTwitter());
        entity.setSitioWebPersonal(dc.getSitioWebPersonal());
        }

        // ===== DIRECCIÓN =====
        DatosDireccionDto dd = dto.getDatosdireccion();
        if(dd!=null) {
        entity.setTipoVia(dd.getTipoVia());
        entity.setVia(dd.getVia());
        entity.setNumero(dd.getNumero());
        entity.setPiso(dd.getPiso());
        entity.setPuerta(dd.getPuerta());
        entity.setTipoVivienda(dd.getTipoVivienda());
        entity.setCodigoPostal(dd.getCodigoPostal());
        entity.setProvincia(dd.getProvincia());
        entity.setLocalidad(dd.getLocalidad());
        entity.setPais(dd.getPais());
        }

        // ===== PRODUCTOS =====
        DatosProductos dprod = dto.getDatosproductos();
        if(dprod!=null) {
        entity.setProductoPrincipal(dprod.getProductoPrincipal());
        entity.setProductosSecundarios(dprod.getProductosSecundarios());
        }
        // ===== PAGO =====
        DatosPagodt pg = dto.getDatospagos();
        if(pg!=null) {
        entity.setTipoPago(pg.getTipoPago());
        entity.setNombreTitular(pg.getNombreTitular());
        entity.setFechaCaducidad(pg.getFechaCaducidad());
        entity.setCodigoSeguridad(pg.getCodigoSeguridad());
        entity.setNombreBanco(pg.getNombreBanco());
        entity.setNumeroCuenta(pg.getNumeroCuenta());
        entity.setSwiftBic(pg.getSwiftBic());
        entity.setTipoCuenta(pg.getTipoCuenta());
        entity.setSucursal(pg.getSucursal());
        }

        // Guardar en BD
        FormularioEntity guardado = repository.save(entity);

        // Convertir de vuelta para enviarlo al front
        return mapEntityToDto(guardado);
    }


    // ============================================================
    // OBTENER POR ID
    // ============================================================
    @Override
    public FormularioUserDto obtenerPorId(Long id) {
        FormularioEntity e = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Formulario no encontrado"));

        return mapEntityToDto(e);
    }


    // ============================================================
    // LISTAR TODOS
    // ============================================================
    @Override
    public List<FormularioUserDto> listarTodos() {
        return repository.findAll()
                .stream()
                .map(this::mapEntityToDto)
                .collect(Collectors.toList());
    }


    // ============================================================
    // ACTUALIZAR
    // ============================================================
    @Override
    public FormularioUserDto actualizar(Long id, FormularioUserDto dto) {
        FormularioEntity e = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Formulario no encontrado"));

        // Reutilizamos la lógica de crear para actualizar
        // Personal
        e.setNombre(dto.getDatospersonales().getNombre());
        e.setApellidos(dto.getDatospersonales().getApellidos());
        e.setFechaNacimiento(dto.getDatospersonales().getFechaNacimiento());
        e.setGenero(dto.getDatospersonales().getGenero());
        e.setNacionalidad(dto.getDatospersonales().getNacionalidad());
        e.setTipoIdentificacion(dto.getDatospersonales().getTipoIdentificacion());
        e.setNumeroIdentificacion(dto.getDatospersonales().getNumeroIdentificacion());
        e.setEstadoCivil(dto.getDatospersonales().getEstadoCivil());

        // Contacto
        e.setTelefonoMovil(dto.getDatoscontacto().getTelefonoMovil());
        e.setTelefonoFijo(dto.getDatoscontacto().getTelefonoFijo());
        e.setCorreoElectronico(dto.getDatoscontacto().getCorreoElectronico());
        e.setPerfilLinkedIn(dto.getDatoscontacto().getPerfilLinkedIn());
        e.setPerfilTwitter(dto.getDatoscontacto().getPerfilTwitter());
        e.setSitioWebPersonal(dto.getDatoscontacto().getSitioWebPersonal());

        // Dirección
        e.setTipoVia(dto.getDatosdireccion().getTipoVia());
        e.setVia(dto.getDatosdireccion().getVia());
        e.setNumero(dto.getDatosdireccion().getNumero());
        e.setPiso(dto.getDatosdireccion().getPiso());
        e.setPuerta(dto.getDatosdireccion().getPuerta());
        e.setTipoVivienda(dto.getDatosdireccion().getTipoVivienda());
        e.setCodigoPostal(dto.getDatosdireccion().getCodigoPostal());
        e.setProvincia(dto.getDatosdireccion().getProvincia());
        e.setLocalidad(dto.getDatosdireccion().getLocalidad());
        e.setPais(dto.getDatosdireccion().getPais());

        // Productos
        e.setProductoPrincipal(dto.getDatosproductos().getProductoPrincipal());
        e.setProductosSecundarios(dto.getDatosproductos().getProductosSecundarios());

        // Pago
        e.setTipoPago(dto.getDatospagos().getTipoPago());
        e.setNombreTitular(dto.getDatospagos().getNombreTitular());
        e.setFechaCaducidad(dto.getDatospagos().getFechaCaducidad());
        e.setCodigoSeguridad(dto.getDatospagos().getCodigoSeguridad());
        e.setNombreBanco(dto.getDatospagos().getNombreBanco());
        e.setNumeroCuenta(dto.getDatospagos().getNumeroCuenta());
        e.setSwiftBic(dto.getDatospagos().getSwiftBic());
        e.setTipoCuenta(dto.getDatospagos().getTipoCuenta());
        e.setSucursal(dto.getDatospagos().getSucursal());

        FormularioEntity actualizado = repository.save(e);

        return mapEntityToDto(actualizado);
    }


    // ============================================================
    // ELIMINAR
    // ============================================================
    @Override
    public void eliminar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Formulario no encontrado");
        }
        repository.deleteById(id);
    }


    // ============================================================
    // MAPPER ENTITY → DTO
    // ============================================================
    private FormularioUserDto mapEntityToDto(FormularioEntity e) {

        FormularioUserDto dto = new FormularioUserDto();

        dto.setDatospersonales(
                new DatosPersonalesDto(
                        e.getNombre(),
                        e.getApellidos(),
                        e.getFechaNacimiento(),
                        e.getGenero(),
                        e.getNacionalidad(),
                        e.getTipoIdentificacion(),
                        e.getNumeroIdentificacion(),
                        e.getEstadoCivil()
                )
        );

        dto.setDatoscontacto(
                new DatosContactoDto(
                        e.getTelefonoMovil(),
                        e.getTelefonoFijo(),
                        e.getCorreoElectronico(),
                        e.getPerfilLinkedIn(),
                        e.getPerfilTwitter(),
                        e.getSitioWebPersonal()
                )
        );

        dto.setDatosdireccion(
                new DatosDireccionDto(
                        e.getTipoVia(),
                        e.getVia(),
                        e.getNumero(),
                        e.getPiso(),
                        e.getPuerta(),
                        e.getTipoVivienda(),
                        e.getCodigoPostal(),
                        e.getProvincia(),
                        e.getLocalidad(),
                        e.getPais()
                )
        );

        dto.setDatosproductos(
                new DatosProductos(
                        e.getProductoPrincipal(),
                        e.getProductosSecundarios()
                )
        );

        dto.setDatospagos(
                new DatosPagodt(
                        e.getTipoPago(),
                        e.getNombreTitular(),
                        e.getFechaCaducidad(),
                        e.getCodigoSeguridad(),
                        e.getNombreBanco(),
                        e.getNumeroCuenta(),
                        e.getSwiftBic(),
                        e.getTipoCuenta(),
                        e.getSucursal()
                )
        );

        return dto;
    }
}




