package com.udea.analisis.rtf.service;
import com.udea.analisis.rtf.dto.EspecialidadDto;
import com.udea.analisis.rtf.entity.Especialidad;
import com.udea.analisis.rtf.repository.EspecialidadRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class EspecialidadService {
    private static final Logger LOGGER =LoggerFactory.getLogger(EspecialidadService.class);
    private EspecialidadRepository especialidadRepository;
    private ModelMapper modelMapper;

    public EspecialidadService(EspecialidadRepository prestadorRepository, ModelMapper modelMapper){
        this.especialidadRepository=prestadorRepository;
        this.modelMapper=modelMapper;
    }
    public EspecialidadDto create(EspecialidadDto especialidadToCreateDto){
        LOGGER.debug("Begin create: EspecialidadToCreateDto={}");

        Especialidad especialidadToCreate=modelMapper.map(especialidadToCreateDto, Especialidad.class);
        Especialidad result=especialidadRepository.save(especialidadToCreate);
        EspecialidadDto resultDto=modelMapper.map(result, EspecialidadDto.class);
        LOGGER.debug("End create: resultDTO={}", resultDto);
        return resultDto;
    }
    public List<EspecialidadDto> findAll() {
        List<Especialidad> listPrestador = (List<Especialidad>) especialidadRepository.findAll();
        return listPrestador.stream()
                .map(prestador -> modelMapper.map(prestador, EspecialidadDto.class))
                .collect(Collectors.toList());
    }
    public EspecialidadDto findById(Long id){
        Optional<Especialidad> findPrestadorOptional=especialidadRepository.findById(id);
        Especialidad findPrestador=findPrestadorOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findPrestador, EspecialidadDto.class);
    }
    public void delete(Long id){
        EspecialidadDto prestadorInDb=findById(id);
        Especialidad prestadorToDelete=modelMapper.map(prestadorInDb, Especialidad.class);
        especialidadRepository.delete(prestadorToDelete);
    }
    public EspecialidadDto update(EspecialidadDto prestadorDto){
        findById(prestadorDto.getIdEspecialidad());
        return create(prestadorDto);
    }
}