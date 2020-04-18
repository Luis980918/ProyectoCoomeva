package com.udea.analisis.rtf.controller;

import com.udea.analisis.rtf.dto.PrestadorDto;
import com.udea.analisis.rtf.service.PrestadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/prestador")
@Validated
public class PrestadorController {
    private PrestadorService prestadorService;

    public PrestadorController(PrestadorService prestadorservice){
        this.prestadorService=prestadorservice;
    }

    @PostMapping
    public ResponseEntity<PrestadorDto> create(@RequestBody @Valid PrestadorDto prestadorDTO){
        PrestadorDto prestadorCreate=prestadorService.create(prestadorDTO);
        return new ResponseEntity<PrestadorDto>(prestadorCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PrestadorDto> update(@RequestBody @Valid PrestadorDto prestadorDTO){
        return ResponseEntity.ok(prestadorService.update(prestadorDTO));
    }
    @GetMapping
    public ResponseEntity<List<PrestadorDto>> findAll() {
        return ResponseEntity.ok(prestadorService.findAll());
    }
    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<PrestadorDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(prestadorService.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        prestadorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
