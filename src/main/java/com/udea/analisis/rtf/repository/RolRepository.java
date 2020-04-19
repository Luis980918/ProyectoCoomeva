package com.udea.analisis.rtf.repository;

import com.udea.analisis.rtf.entity.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
}

