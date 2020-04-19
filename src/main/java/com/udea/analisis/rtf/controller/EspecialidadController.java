package com.udea.analisis.rtf.controller;
import com.udea.analisis.rtf.dto.EspecialidadDto;
import com.udea.analisis.rtf.service.EspecialidadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/especialidad")
@Validated
public class EspecialidadController {
    private  EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService prestadorservice){
        this.especialidadService=especialidadService;
    }

    @PostMapping
    public ResponseEntity<EspecialidadDto> create(@RequestBody @Valid EspecialidadDto especialidadDTO){
        EspecialidadDto prestadorCreate=especialidadService.create(especialidadDTO);
        return new ResponseEntity<EspecialidadDto>(prestadorCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<EspecialidadDto> update(@RequestBody @Valid EspecialidadDto especialidadDTO){
        return ResponseEntity.ok(especialidadService.update(especialidadDTO));
    }
    @GetMapping
    public ResponseEntity<List<EspecialidadDto>> findAll() {
        return ResponseEntity.ok(especialidadService.findAll());
    }
    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<EspecialidadDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(especialidadService.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        especialidadService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
