package com.udea.analisis.rtf.repository;
import com.udea.analisis.rtf.entity.Especialidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EspecialidadRepository extends CrudRepository<Especialidad, Long> {
}
