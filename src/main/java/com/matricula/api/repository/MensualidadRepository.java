package com.matricula.api.repository;

import com.matricula.api.model.Mensualidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensualidadRepository extends JpaRepository<Mensualidad, Long> {
}
