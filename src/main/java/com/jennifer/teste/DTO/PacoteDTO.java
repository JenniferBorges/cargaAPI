
package com.jennifer.teste.DTO;

import com.jennifer.teste.entity.Entrega;
import com.jennifer.teste.entity.Pacote;

/**
 *
 * @author jennifer
 */
public class PacoteDTO {
    
    private String id;
    private String peso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    public  Pacote pacoteToEntity(Entrega entrega){
        Pacote pacote = new Pacote();
        pacote.setId(Long.valueOf(id));
        pacote.setPeso(Double.valueOf(peso));
        pacote.setEntrega(entrega);
        return pacote;
    }
        
    
}
