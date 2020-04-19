package com.udea.analisis.rtf.service;

import com.udea.analisis.rtf.dto.TServicioDto;
import com.udea.analisis.rtf.entity.TServicio;
import com.udea.analisis.rtf.repository.TServicioRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TServicioService {
    private static final Logger LOGGER =LoggerFactory.getLogger(TServicioService.class);
    private TServicioRepository tServicioRepository;
    private ModelMapper modelMapper;

    public TServicioService(TServicioRepository tServicioRepository, ModelMapper modelMapper){
        this.tServicioRepository=tServicioRepository;
        this.modelMapper=modelMapper;
    }
    public TServicioDto create(TServicioDto tServicioToCreateDto){
        LOGGER.debug("Begin create: PrestadorToCreateDto={}");

        TServicio tServiciotoCreate=modelMapper.map(tServicioToCreateDto, TServicio.class);
        TServicio result=tServicioRepository.save(tServiciotoCreate);
        TServicioDto resultDto=modelMapper.map(result, TServicioDto.class);
        LOGGER.debug("End create: resultDTO={}", resultDto);
        return resultDto;
    }
    public List<TServicioDto> findAll() {
        List<TServicio> listTServicio = (List<TServicio>) tServicioRepository.findAll();
        return listTServicio.stream()
                .map(tServicio -> modelMapper.map(tServicio, TServicioDto.class))
                .collect(Collectors.toList());
    }
    public TServicioDto findById(Long id){
        Optional<TServicio> findTservicioOptional=tServicioRepository.findById(id);
        TServicio findTservicio=findTservicioOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findTservicio, TServicioDto.class);
    }
    public void delete(Long id){
        TServicioDto TServicioInDb=findById(id);
        TServicio tServicioToDelete=modelMapper.map(TServicioInDb, TServicio.class);
        tServicioRepository.delete(tServicioToDelete);
    }
    public TServicioDto update(TServicioDto tServicioDto){
        findById(tServicioDto.getIdTServicio());
        return create(tServicioDto);
    }
}
