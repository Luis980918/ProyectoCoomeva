package com.udea.analisis.rtf.dto;

import com.udea.analisis.rtf.constants.ValidatorConstants;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class RolDto {

    private Long id;

    @NotNull
    @Size(min = ValidatorConstants.MIN_CODPRESTADOR, max = ValidatorConstants.MAX_CODPRESTADOR, message = ValidatorConstants.BAD_SIZE_CODPRESTADOR_MESSAGE)

    public RolDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
