package org.example.cadastroempresa.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Identificacao;
import org.example.cadastroempresa.model.Inscrito;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class InscritoDTO {

    private boolean assinante;

    private boolean associado;

    private boolean afiliado;

    public Inscrito toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Inscrito.class);
    }
}
