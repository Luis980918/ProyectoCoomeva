package com.udea.analisis.rtf.service;

import com.udea.analisis.rtf.dto.CitaDto;
import com.udea.analisis.rtf.dto.UsuarioDto;
import com.udea.analisis.rtf.entity.Cita;
import com.udea.analisis.rtf.entity.Usuario;
import com.udea.analisis.rtf.repository.CitaRepository;
import com.udea.analisis.rtf.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CitaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CitaService.class);

    private CitaRepository citaRepository;

    private ModelMapper modelMapper;


    public CitaService(CitaRepository citaRepository, ModelMapper modelMapper) {
        this.citaRepository = citaRepository;
        this.modelMapper = modelMapper;
    }

    public CitaDto create(CitaDto citaToCreateDto) {
        LOGGER.debug("Begin create: citaToCreateDto={}", citaToCreateDto);

        Cita citaToCreate = modelMapper.map(citaToCreateDto, Cita.class);
        Cita result = citaRepository.save(citaToCreate);
        CitaDto resultDTO = modelMapper.map(result, CitaDto.class);

        LOGGER.debug("End create: resultDTO={}", resultDTO);
        return resultDTO;
    }

    public List<CitaDto> findAll() {
        List<Cita> listDate = (List<Cita>) citaRepository.findAll();
        return listDate.stream()
                .map(cita -> modelMapper.map(cita, CitaDto.class))
                .collect(Collectors.toList());
    }

    public CitaDto findById(Long id) {
        Optional<Cita> findCitaOptional = citaRepository.findById(id);
        Cita findCita = findCitaOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findCita, CitaDto.class);
    }

    public void delete(Long id) {
        CitaDto citaInDb = findById(id);
        Cita citaToDelete = modelMapper.map(citaInDb, Cita.class);
        citaRepository.delete(citaToDelete);
    }

    public CitaDto update(CitaDto citaDto) {
        findById(citaDto.getIdCita());
        return create(citaDto);
    }



}
