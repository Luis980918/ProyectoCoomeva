package com.udea.analisis.rtf.controller;
import com.udea.analisis.rtf.dto.AutorizacionDto;
import com.udea.analisis.rtf.service.AutorizacionService;
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
@RequestMapping(path = "/v1/autorizacion")
@Validated
public class AutorizacionController {

    private AutorizacionService autorizacionService;

    public AutorizacionController(AutorizacionService autorizacionService) {
        this.autorizacionService = autorizacionService;
    }
        @PostMapping
      public ResponseEntity<AutorizacionDto> create(@RequestBody @Valid AutorizacionDto autorizacionDTO){
            AutorizacionDto autorizacionCreate = autorizacionService.create(autorizacionDTO);
            return new ResponseEntity<AutorizacionDto>(autorizacionCreate, null, HttpStatus.CREATED);
        }

        @PutMapping
        public ResponseEntity<AutorizacionDto> update (@RequestBody @Valid AutorizacionDto autorizacionDTO){
            return ResponseEntity.ok(autorizacionService.update(autorizacionDTO));
        }

        @GetMapping
        public ResponseEntity<List<AutorizacionDto>> findAll () {
            return ResponseEntity.ok(autorizacionService.findAll());
        }

        @Validated
        @GetMapping("/{id}")
        public ResponseEntity<AutorizacionDto> findById (
                @PathVariable @NotNull @Valid Long id){
            return ResponseEntity.ok(autorizacionService.findById(id));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> delete (@PathVariable Long id){
            autorizacionService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }


    }

