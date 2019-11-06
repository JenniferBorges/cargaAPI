package com.jennifer.teste.service;

import com.jennifer.teste.entity.Pacote;
import com.jennifer.teste.repository.PacoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jennifer
 */
@Service
public class PacoteService {
    
    @Autowired
    private PacoteRepository pacoteRepository;
    
    public void createPacote(Pacote pacote) {
        
        pacoteRepository.save(pacote);
        
    }
    
}
