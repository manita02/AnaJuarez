
package com.portfolioweb.aj.Entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Entity  //este archivo va a contener entidades
public class Persona{
    @Id  //primer campo sera primaru key 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerado
    private Long id; 
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud..")
    private String nombre; 
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud..")
    private String apellido; 
    
    @Size(min = 1, max = 50, message = "no cumple con la longitud..")
    private String img; 

    
    //GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
}
