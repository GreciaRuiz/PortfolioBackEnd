package com.portfolio.PortfolioGR.Controller;

import com.portfolio.PortfolioGR.Entity.Persona;
import com.portfolio.PortfolioGR.Interface.InterfacePersonaService;
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
@CrossOrigin (origins={"https://frontendgruiz.web.app", "http://localhost:4200"})
public class PersonaController {
     @Autowired 
     private InterfacePersonaService IPersonaService;
     
     @GetMapping("/personas/traer")
     public List<Persona> getPersona(){
         return IPersonaService.getPersona();
     }
     
     @PostMapping("/personas/crear")
     public void createPersona(@RequestBody Persona persona){
         IPersonaService.savePersona(persona);
     }
     
     @DeleteMapping("/personas/borrar/{Id}")
     public void deletePersona(@PathVariable Long Id){
         IPersonaService.deletePersona(Id);
     }
     
     @GetMapping ("/personas/traer/perfil")
     public Persona findPersona(){
         return IPersonaService.findPersona((long)1);
     }
     
     @PutMapping("/personas/editar/{Id}")
     public Persona editPersona(@PathVariable Long Id, @RequestParam ("Nombre") String nuevoNom, @RequestParam ("Titulo") String nuevoTitulo ){
         Persona persona= IPersonaService.findPersona(Id);
         
         persona.setNombre(nuevoNom);
         persona.setTitulo(nuevoTitulo);
         
         IPersonaService.savePersona(persona);
         return persona;
     }
     
     
    
}
