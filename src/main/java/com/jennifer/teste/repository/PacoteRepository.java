
package com.jennifer.teste.repository;

import com.jennifer.teste.entity.Pacote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jennifer
 */
@Repository
public interface PacoteRepository extends CrudRepository<Pacote, Long>{
    
}
