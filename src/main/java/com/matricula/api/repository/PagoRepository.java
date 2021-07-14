package com.matricula.api.repository;

import com.matricula.api.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    List<Pago> findByAlumno_Id(Long id);
    List<Pago> findByEstadoAndAlumno_IdAndMensualidad_FechaFinalBefore(Boolean estado , Long id , LocalDate mes);
}
