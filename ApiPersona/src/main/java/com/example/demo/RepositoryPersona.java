
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Gamerenoc
 */
@Repository
public interface RepositoryPersona extends JpaRepository<ModeloPersona, String>{
    
}
