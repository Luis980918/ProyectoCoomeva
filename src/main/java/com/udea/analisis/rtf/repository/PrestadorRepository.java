package com.udea.analisis.rtf.repository;
import com.udea.analisis.rtf.entity.Prestador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestadorRepository extends CrudRepository<Prestador, Long> {
}
