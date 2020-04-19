package com.udea.analisis.rtf.repository;
import com.udea.analisis.rtf.entity.Autorizacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorizacionRepository extends  CrudRepository<Autorizacion, Long> {

}
