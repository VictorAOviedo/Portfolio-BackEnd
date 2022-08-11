package com.portfolio.victor.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DtoSkills {
    @NotBlank
    private String nombreSkills;
    @NotBlank
    private String imagenSkills;
    @NotBlank
    private String porcentajeSkills;

    public DtoSkills() {
    }

    public DtoSkills(String nombreSkills, String imagenSkills, String porcentajeSkills) {
        this.nombreSkills = nombreSkills;
        this.imagenSkills = imagenSkills;
        this.porcentajeSkills = porcentajeSkills;
    }  
}
