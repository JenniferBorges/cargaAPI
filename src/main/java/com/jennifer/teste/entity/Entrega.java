
package com.jennifer.teste.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jennifer
 */
@Entity
@Table
public class Entrega implements Serializable{
    
    @Id
    @Column
    private Long id;
    
    @Column
    private String veiculo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
    
    
  
}
