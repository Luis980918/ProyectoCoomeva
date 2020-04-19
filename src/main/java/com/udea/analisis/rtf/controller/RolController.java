package com.udea.analisis.rtf.controller;

import com.udea.analisis.rtf.dto.RolDto;
import com.udea.analisis.rtf.service.RolService;
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
@RequestMapping(path = "/v1/ROl")
@Validated

public class RolController {

    private RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @PostMapping
    public ResponseEntity<RolDto> create(@RequestBody @Valid RolDto rolDTO) {
        RolDto rolCreate = rolService.create(rolDTO);
        return new ResponseEntity<RolDto>(rolCreate, null, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<RolDto> update(@RequestBody @Valid RolDto rolDTO) {
        return ResponseEntity.ok(rolService.update(rolDTO));
    }

    @GetMapping
    public ResponseEntity<List<RolDto>> findAll() {
        return ResponseEntity.ok(rolService.findAll());
    }

    @Validated
    @GetMapping("/{id}")
    public ResponseEntity<RolDto> findById(
            @PathVariable @NotNull @Valid Long id) {
        return ResponseEntity.ok(rolService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        rolService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
