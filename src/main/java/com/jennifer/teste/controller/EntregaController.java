package com.jennifer.teste.controller;

import com.jennifer.teste.DTO.EntregaDTO;
import com.jennifer.teste.DTO.PacoteDTO;
import com.jennifer.teste.entity.Entrega;
import com.jennifer.teste.service.EntregaService;
import com.jennifer.teste.service.PacoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jennifer
 */
@RestController
public class EntregaController {

    @Autowired
    private EntregaService entregaService;
    
    @Autowired
    private PacoteService pacoteService;

    @PostMapping("/delivery")
    public void createEntrega(@RequestBody EntregaDTO entregaDTO) {
        Entrega entrega = entregaDTO.dtoToEntity();  
        entregaService.createEntrega(entrega);
      
//        List<PacoteDTO> pacotes = entregaDTO.getPacotes();
//        for (PacoteDTO pacote : pacotes) {
//            pacoteService.createPacote(pacote.pacoteToEntity(entrega));
//        }

//        entregaDTO.getPacotes().forEach(pacote -> pacoteService.createPacote(pacote.pacoteToEntity(entrega)));

        entregaDTO.getPacotes().stream()
                .map(pacote -> pacote.pacoteToEntity(entrega))
                .forEach(pacoteService::createPacote);
        
        
    }
    
    

}
