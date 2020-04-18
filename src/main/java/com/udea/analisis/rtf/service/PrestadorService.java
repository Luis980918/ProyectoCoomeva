package com.udea.analisis.rtf.service;
import com.udea.analisis.rtf.dto.PrestadorDto;
import com.udea.analisis.rtf.entity.Prestador;
import com.udea.analisis.rtf.repository.PrestadorRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PrestadorService {
    private static final Logger LOGGER =LoggerFactory.getLogger(PrestadorService.class);
    private PrestadorRepository prestadorRepository;
    private ModelMapper modelMapper;

    public PrestadorService(PrestadorRepository prestadorRepository, ModelMapper modelMapper){
        this.prestadorRepository=prestadorRepository;
        this.modelMapper=modelMapper;
    }
    public PrestadorDto create(PrestadorDto prestadorToCreateDto){
        LOGGER.debug("Begin create: PrestadorToCreateDto={}");

        Prestador prestadorToCreate=modelMapper.map(prestadorToCreateDto, Prestador.class);
        Prestador result=prestadorRepository.save(prestadorToCreate);
        PrestadorDto resultDto=modelMapper.map(result, PrestadorDto.class);
        LOGGER.debug("End create: resultDTO={}", resultDto);
        return resultDto;
    }
    public List<PrestadorDto> findAll() {
        List<Prestador> listPrestador = (List<Prestador>) prestadorRepository.findAll();
        return listPrestador.stream()
                .map(prestador -> modelMapper.map(prestador, PrestadorDto.class))
                .collect(Collectors.toList());
    }
    public PrestadorDto findById(Long id){
        Optional<Prestador> findPrestadorOptional=prestadorRepository.findById(id);
        Prestador findPrestador=findPrestadorOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findPrestador, PrestadorDto.class);
    }
    public void delete(Long id){
        PrestadorDto prestadorInDb=findById(id);
        Prestador prestadorToDelete=modelMapper.map(prestadorInDb, Prestador.class);
        prestadorRepository.delete(prestadorToDelete);
    }
    public PrestadorDto update(PrestadorDto prestadorDto){
        findById(prestadorDto.getIdPrestador());
        return create(prestadorDto);
    }
}
