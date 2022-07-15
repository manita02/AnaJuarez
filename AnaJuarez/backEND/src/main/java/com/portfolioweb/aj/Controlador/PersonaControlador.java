
package com.portfolioweb.aj.Controlador;

import com.portfolioweb.aj.Entidad.Persona;
import com.portfolioweb.aj.Interfaz.IPersonaServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaControlador {
    @Autowired IPersonaServicio ipersonaservice; 
    
    
    
    @GetMapping("personas/traer") //trae/lleva info de la base de datos al front
    public List<Persona> getPersona(){
        return ipersonaservice.getPersona();
    }
    
    @PostMapping("/personas/crear") //desde el front guardame tal informacion en la base de datos
    public String crearPersona(@RequestBody Persona persona){
        ipersonaservice.guardarPersona(persona);
        return "Se ha creado satifactoriamente la persona ingresada"; 
    }
    
    @DeleteMapping("/personas/borrar/(id)")
    public String borrarPersona(@PathVariable Long id){
        ipersonaservice.eliminarPersona(id);
        return "Se ha eliminado satifactoriamente la persona ingresada";
    }
    
    
    //URL = PUERTO/personas/editar/4/nombre & apellido & img  (asi quedaria masomenos la URL)
    @PutMapping("/personas/editar/(id)") //para editar las personas
    public Persona editarPersona(@PathVariable Long id,
                                 @RequestParam("nombre")String nuevoNombre,  //en nuevoNombre se va a guardar la modificacion que se realice en "nombre"
                                 @RequestParam("apellido")String nuevoApellido,
                                 @RequestParam("img")String nuevaImagen){
    
            Persona persona = ipersonaservice.buscarPersona(id);
            
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            persona.setImg(nuevaImagen); 
            
            
            ipersonaservice.guardarPersona(persona); //una vez que se relizaron todas las ediciones se guarda la persona y se la manda por return
            return persona; 
            
            
            //IR A LA PARTE DEL PRINCIPIO DEL VIDEO DONDE DECLARA LAS VARIABLES PRIVATE Y BUSCAR LOS SETTER Y GETTERS DE APELLIDO
    
    
    } 
    
    @GetMapping("/personas/traer/perfil")
    public Persona buscarPersona(){
        return ipersonaservice.buscarPersona((long)1); 
    }
    
                                 
    
 }
