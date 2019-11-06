
package com.jennifer.teste.service;

import com.jennifer.teste.entity.Entrega;
import com.jennifer.teste.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jennifer
 */
@Service
public class EntregaService {
    
    @Autowired
    private EntregaRepository entregaRepository;
    
    public void createEntrega(Entrega entrega) {
        entregaRepository.save(entrega);
    }
         
}
