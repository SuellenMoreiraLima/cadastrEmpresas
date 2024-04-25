package org.example.cadastroempresa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Credencial;
import org.example.cadastroempresa.model.Documentacao;
import org.modelmapper.ModelMapper;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class DocumentacaoDTO {

    private String numero;

    private String orgaoEmissor;

    private String estadoEmissor;

    private Date dataValidade;

    public Documentacao toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Documentacao.class);
    }
}
