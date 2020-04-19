package com.udea.analisis.rtf.controller;

import com.udea.analisis.rtf.dto.TServicioDto;
import com.udea.analisis.rtf.service.TServicioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(path = "/v1/tservicio")
@Validated
public class TServicioController {
    private TServicioService tServicioService;

    public TServicioController(TServicioService tServicioService){
        this.tServicioService=tServicioService;

    }

    @PostMapping
    public ResponseEntity<TServicioDto> create(@RequestBody @Valid TServicioDto tServicioDto){
        TServicioDto prestadorCreate=tServicioService.create(tServicioDto);
        return new ResponseEntity<TServicioDto>(prestadorCreate, null, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<TServicioDto> update(@RequestBody @Valid TServicioDto tServicioDto){
        return ResponseEntity.ok(tServicioService.update(tServicioDto));
    }
    @GetMapping
    public ResponseEntity<List<TServicioDto>> findAll() {
        return ResponseEntity.ok(tServicioService.findAll());
    }
    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<TServicioDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(tServicioService.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tServicioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
