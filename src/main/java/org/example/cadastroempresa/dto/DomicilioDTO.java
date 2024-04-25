package org.example.cadastroempresa.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Documentacao;
import org.example.cadastroempresa.model.Domicilio;
import org.example.cadastroempresa.model.DomicilioTipo;
import org.example.cadastroempresa.model.Endereco;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class DomicilioDTO {

    @Id
    private Integer id;

    @Embedded
    private DomicilioTipo domicilioTipo;

    @Embedded
    private Endereco endereco;

    public Domicilio toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Domicilio.class);
    }
}
