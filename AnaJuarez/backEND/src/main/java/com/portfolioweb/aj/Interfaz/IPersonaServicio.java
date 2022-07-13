
package com.portfolioweb.aj.Interfaz;

import com.portfolioweb.aj.Entidad.Persona;
import java.util.List;


public interface IPersonaServicio {
    //TRAER UNA LISTA DE PERSONA
    public List<Persona>getPersona(); 
    
    //GUARDAR UN OBJETO DE TIPO PERSONA
    public void guardarPersona(Persona persona); 
    
    //ELIMINAR UN OBJETO/USUARIO, LO BUSCAMOS POR ID
    public void eliminarPersona(Long id); 
    
    //BUSCAR UNA PERSONA
    public Persona buscarPersona(Long id); 
    
}
