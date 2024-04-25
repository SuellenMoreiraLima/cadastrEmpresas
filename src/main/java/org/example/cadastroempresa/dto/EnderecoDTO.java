package org.example.cadastroempresa.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Documentacao;
import org.example.cadastroempresa.model.Endereco;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private String cep;

    private String logradouro;

    private String numero;

    private String bairro;

    private String complemento;

    private String pontoReferencia;

    private String uf;

    private String cidade;

    private  Integer ibge;

    public Endereco toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Endereco.class);
    }
}
