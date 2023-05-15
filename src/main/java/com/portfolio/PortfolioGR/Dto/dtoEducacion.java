package com.portfolio.PortfolioGR.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEd;
    @NotBlank
    private String perdiodoEd;
    @NotBlank
    private String descripcionEd;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreEd,String perdiodoEd, String descripcionEd) {
        this.nombreEd = nombreEd;
        this.perdiodoEd= perdiodoEd;
        this.descripcionEd = descripcionEd;
    }

    public String getNombreEd() {
        return nombreEd;
    }

    public void setNombreEd(String nombreEd) {
        this.nombreEd = nombreEd;
    }
    
    public String getPeriodoEd() {
        return perdiodoEd;
    }

    public void setPeriodoEd(String perdiodoEd) {
        this.perdiodoEd = perdiodoEd;
    }

    public String getDescripcionEd() {
        return descripcionEd;
    }

    public void setDescripcionEd(String descripcionEd) {
        this.descripcionEd = descripcionEd;
    }
}
