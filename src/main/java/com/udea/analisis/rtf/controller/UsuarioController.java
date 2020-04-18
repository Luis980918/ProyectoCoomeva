package com.udea.analisis.rtf.controller;

import com.udea.analisis.rtf.dto.UsuarioDto;
import com.udea.analisis.rtf.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@RequestMapping(path = "/v1/usuario")
@Validated
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDto> create(@RequestBody @Valid UsuarioDto usuarioDTO) {
        UsuarioDto personCreate = usuarioService.create(usuarioDTO);
        return new ResponseEntity<UsuarioDto>(personCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<UsuarioDto> update(@RequestBody @Valid UsuarioDto usuarioDTO) {
        return ResponseEntity.ok(usuarioService.update(usuarioDTO));
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDto>> findAll() {
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        usuarioService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
