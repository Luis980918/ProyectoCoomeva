package com.udea.analisis.rtf.service;
import com.udea.analisis.rtf.dto.AutorizacionDto;
import com.udea.analisis.rtf.entity.Autorizacion;
import com.udea.analisis.rtf.repository.AutorizacionRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AutorizacionService {
    private static final Logger LOGGER =LoggerFactory.getLogger(AutorizacionService.class);
    private AutorizacionRepository autorizacionRepository;
    private ModelMapper modelMapper;

    public AutorizacionService(AutorizacionRepository autorizacionRepository,ModelMapper modelMapper){
        this.autorizacionRepository=autorizacionRepository;
        this.modelMapper=modelMapper;
    }

    public AutorizacionDto create(AutorizacionDto autorizacionToCreateDto){
        LOGGER.debug("Begin create: AutorizacionToCreateDto={}");
        Autorizacion autorizacionToCreate=modelMapper.map(autorizacionToCreateDto, Autorizacion.class);
        Autorizacion result=autorizacionRepository.save(autorizacionToCreate);
        AutorizacionDto resultDto=modelMapper.map(result, AutorizacionDto.class);
        LOGGER.debug("End create: resultDTO={}", resultDto);
        return resultDto;
    }

    public List<AutorizacionDto> findAll(){
        List<Autorizacion> listAutorizacion=(List<Autorizacion>) autorizacionRepository.findAll();
        return listAutorizacion.stream()
                .map(autorizacion -> modelMapper.map(autorizacion, AutorizacionDto.class))
                .collect(Collectors.toList());
    }

    public AutorizacionDto findById(Long id){
        Optional<Autorizacion> findAutorizacionOptional=autorizacionRepository.findById(id);
        Autorizacion findAutorizacion=findAutorizacionOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findAutorizacion, AutorizacionDto.class);
    }

    public void delete(Long id){
        AutorizacionDto autorizacionInDb=findById(id);
        Autorizacion autorizacionToDelete=modelMapper.map(autorizacionInDb, Autorizacion.class);
        autorizacionRepository.delete(autorizacionToDelete);
    }

    public AutorizacionDto update(AutorizacionDto autorizacionDto){
        findById(autorizacionDto.getIdAutorizacion());
        return create(autorizacionDto);
    }

}
