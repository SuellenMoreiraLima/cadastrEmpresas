package org.example.cadastroempresa.dto;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Documentacao;
import org.example.cadastroempresa.model.Identificacao;
import org.example.cadastroempresa.model.IdentificacaoTipo;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class IdentificacaoDTO {

    private Integer empresa;

    private String identificador;

    @Embedded
    private IdentificacaoTipo identificacaoTipo;

    public Identificacao toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Identificacao.class);
    }
}
