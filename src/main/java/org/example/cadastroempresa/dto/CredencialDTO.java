package org.example.cadastroempresa.dto;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.model.Cadastro;
import org.example.cadastroempresa.model.Credencial;
import org.modelmapper.ModelMapper;

@NoArgsConstructor
@AllArgsConstructor
public class CredencialDTO {

    private boolean bloqueada;

    private String expirada;

    private String senha;

    public Credencial toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Credencial.class);
    }
}
