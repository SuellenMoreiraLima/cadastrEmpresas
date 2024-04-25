package org.example.cadastroempresa.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Identificacao;
import org.example.cadastroempresa.model.Parceiro;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class ParceiroDTO {

    private boolean cliente;

    private boolean fornecedor;

    private boolean prestador;

    private boolean colaborador;

    public Parceiro toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Parceiro.class);
    }
}
