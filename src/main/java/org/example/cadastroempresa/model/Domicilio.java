package org.example.cadastroempresa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.dto.DocumentacaoDTO;
import org.example.cadastroempresa.dto.DomicilioDTO;
import org.modelmapper.ModelMapper;

@Entity
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "domicilio")
public class Domicilio {

    @Id
    private Integer id;

    @Embedded
    private DomicilioTipo domicilioTipo;

    @Embedded
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DomicilioDTO toDTO() {
        ModelMapper mapper = new ModelMapper();

        DomicilioDTO dto = mapper.map(this, DomicilioDTO.class);

        return dto;
    }
}
