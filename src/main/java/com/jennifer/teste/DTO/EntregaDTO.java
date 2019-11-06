package com.jennifer.teste.DTO;

import com.jennifer.teste.entity.Entrega;
import java.util.List;

/**
 *
 * @author jennifer
 */
public class EntregaDTO {

    private String veiculo;
    private String entregaId;
    private List<PacoteDTO> pacotes;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(String entregaId) {
        this.entregaId = entregaId;
    }

    public List<PacoteDTO> getPacotes() {
        return pacotes;
    }

    public void setPacotes(List<PacoteDTO> pacotes) {
        this.pacotes = pacotes;
    }

    public Entrega dtoToEntity() {
        Entrega entrega = new Entrega();
        entrega.setId(Long.valueOf(entregaId));
        entrega.setVeiculo(veiculo);
        return entrega;
    }

}
