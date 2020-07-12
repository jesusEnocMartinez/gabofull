
package com.example.demo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gamerenoc
 */

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/api") 
public class ControllerPersona {
   
   
    
      @Autowired
    private RepositoryPersona repo;
     
    @GetMapping(path ="/persona")
    public List<ModeloPersona>listar(){
    return repo.findAll();
    }
    
    @PostMapping(path ="/persona")
    public void insertar(@RequestBody ModeloPersona S){
    repo.save(S);
    }
    
    @PutMapping(path="/persona/{id}")
    public void modificar(@RequestBody ModeloPersona S ){
       
    repo.save(S);
    }
    
    @DeleteMapping(value ="persona/{id}")
    public void eleminar(@PathVariable("numerojuego") String clave){
    repo.deleteById(clave);
    }
    
         @GetMapping(value ="persona/{id}")
    public ModeloPersona uno(@PathVariable("id") String clave){
        Optional<ModeloPersona> findById = repo.findById(clave);
    return findById.get();
    }
}
