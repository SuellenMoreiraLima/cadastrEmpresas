package org.example.cadastroempresa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Identificacao;
import org.example.cadastroempresa.model.Telefone;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {

    private Long numero;

    private boolean celular;

    private  boolean whatsapp;

    private  boolean telegram;

    public Telefone toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Telefone.class);
    }
}
