package org.example.cadastroempresa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.dto.IdentificacaoDTO;
import org.example.cadastroempresa.dto.TelefoneDTO;
import org.modelmapper.ModelMapper;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Telefone {

    @Column(insertable=false, updatable=false)
    private Long numero;

    private boolean celular;

    private  boolean whatsapp;

    private  boolean telegram;

    public TelefoneDTO toDTO() {
        ModelMapper mapper = new ModelMapper();

        TelefoneDTO dto = mapper.map(this, TelefoneDTO.class);

        return dto;
    }
}
