package com.udea.analisis.rtf.repository;
import com.udea.analisis.rtf.entity.TServicio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TServicioRepository extends CrudRepository<TServicio, Long> {
}
