
package com.jennifer.teste.repository;

import com.jennifer.teste.entity.Entrega;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jennifer
 */
@Repository
public interface EntregaRepository  extends CrudRepository<Entrega, Long>{
    
}
