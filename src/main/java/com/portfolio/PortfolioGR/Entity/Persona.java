package com.portfolio.PortfolioGR.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long Id;
    
    @NotNull
    @Size(min=1, max=50, message= "No cumple con la longitud.")
    private String Nombre;
    
    @NotNull
    @Size(min=1, max=50, message= "No cumple con la longitud.")
    private String Titulo;
    
    /*@NotNull
    @Size(min=1, max=50, message= "No cumple con la longitud.")
    private String Descrip;*/
    
    /*@NotNull
    @Size(min=1, max=50, message= "No cumple con la longitud.")
    private byte [] img;*/

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /*public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }*/
    
}
