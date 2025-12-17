package com.trinitarias.Spotifyform.repo;


import com.trinitarias.Spotifyform.entidad.FormularioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<FormularioEntity, Long> {

    boolean existsByCorreoElectronico(String correoElectronico);

    boolean existsByNumeroIdentificacion(String numeroIdentificacion);
}

