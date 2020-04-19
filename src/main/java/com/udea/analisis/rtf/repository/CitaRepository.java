package com.udea.analisis.rtf.repository;

import com.udea.analisis.rtf.entity.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaRepository extends CrudRepository<Cita, Long> {
}
