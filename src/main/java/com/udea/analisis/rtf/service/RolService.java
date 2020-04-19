package com.udea.analisis.rtf.service;

import com.udea.analisis.rtf.dto.RolDto;
import com.udea.analisis.rtf.entity.Rol;
import com.udea.analisis.rtf.repository.RolRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service

public class RolService {
    private static final Logger LOGGER = LoggerFactory.getLogger(RolService.class);

    private RolRepository rolRepository;

    private ModelMapper modelMapper;


    public RolService(RolRepository rolRepository, ModelMapper modelMapper) {
        this.rolRepository = rolRepository;
        this.modelMapper = modelMapper;
    }

    public RolDto create(RolDto rolToCreateDto) {
        LOGGER.debug("Begin create: RolToCreateDto={}", rolToCreateDto);

        Rol rolToCreate = modelMapper.map(rolToCreateDto, Rol.class);
        Rol result = rolRepository.save(rolToCreate);
        RolDto resultDTO = modelMapper.map(result, RolDto.class);

        LOGGER.debug("End create: resultDTO={}", resultDTO);
        return resultDTO;
    }

    public List<RolDto> findAll() {
        List<Rol> listRoles = (List<Rol>) rolRepository.findAll();
        return listRoles.stream()
                .map(rolService -> modelMapper.map(rolService, RolDto.class))
                .collect(Collectors.toList());
    }

    public RolDto findById(Long id) {
        Optional<Rol> findRolOptional = rolRepository.findById(id);
        Rol findRolService = findRolOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findRolService,RolDto.class);
    }

    public void delete(Long id) {
        RolDto rolInDb = findById(id);
        Rol rolToDelete = modelMapper.map(rolInDb, Rol.class);
        rolRepository.delete(rolToDelete);
    }

    public RolDto update(RolDto rolDto) {
        findById(rolDto.getId());
        return create(rolDto);
    }
}
