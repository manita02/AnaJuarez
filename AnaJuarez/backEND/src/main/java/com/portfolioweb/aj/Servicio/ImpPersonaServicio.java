
package com.portfolioweb.aj.Servicio;

import com.portfolioweb.aj.Entidad.Persona;
import com.portfolioweb.aj.Interfaz.IPersonaServicio;
import com.portfolioweb.aj.Repositorio.IPersonaRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class ImpPersonaServicio implements IPersonaServicio {
    @Autowired IPersonaRepositorio ipersonarepositorio; //crea objeto (en color rosa el nombre) y el tipo es IPersonaRepositorio
    
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepositorio.findAll(); 
        return persona; 
    }

    @Override
    public void guardarPersona(Persona persona) {
        ipersonarepositorio.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        ipersonarepositorio.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona persona = ipersonarepositorio.findById(id).orElse(null); 
        return persona; 
    }
    
}
