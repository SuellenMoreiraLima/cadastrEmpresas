package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.dto.DocumentacaoDTO;
import org.example.cadastroempresa.dto.IdentificacaoDTO;
import org.modelmapper.ModelMapper;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Identificacao {

    private Integer empresa;

    private String identificador;

    @Embedded
    private IdentificacaoTipo identificacaoTipo;

    public Integer getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Integer empresa) {
        this.empresa = empresa;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public IdentificacaoDTO toDTO() {
        ModelMapper mapper = new ModelMapper();

        IdentificacaoDTO dto = mapper.map(this, IdentificacaoDTO.class);

        return dto;
    }
}
