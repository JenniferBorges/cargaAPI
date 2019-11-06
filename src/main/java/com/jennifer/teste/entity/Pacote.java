
package com.jennifer.teste.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jennifer
 */
@Entity
@Table
public class Pacote implements Serializable {
    
    
    @Id
    @Column
    private Long id;
    
    @Column
    private Double peso;
    
    @ManyToOne
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    
    
}
