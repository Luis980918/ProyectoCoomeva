package com.udea.analisis.rtf.controller;

import com.udea.analisis.rtf.dto.CitaDto;
import com.udea.analisis.rtf.service.CitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/cita")
@Validated

public class CitaController {
    private CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @PostMapping
    public ResponseEntity<CitaDto> create(@RequestBody @Valid CitaDto citaDTO) {
        CitaDto citaCreate = citaService.create(citaDTO);
        return new ResponseEntity<CitaDto>(citaCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<CitaDto> update(@RequestBody @Valid CitaDto citaDTO) {
        return ResponseEntity.ok(citaService.update(citaDTO));
    }

    @GetMapping
    public ResponseEntity<List<CitaDto>> findAll() {
        return ResponseEntity.ok(citaService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<CitaDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(citaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        citaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
