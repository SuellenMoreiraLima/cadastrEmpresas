package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.dto.CadastroDTO;
import org.example.cadastroempresa.dto.CredencialDTO;
import org.modelmapper.ModelMapper;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Credencial {

    private boolean bloqueada;

    private String expirada;

    private String senha;

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public String getExpirada() {
        return expirada;
    }

    public void setExpirada(String expirada) {
        this.expirada = expirada;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public CredencialDTO toDTO() {
        ModelMapper mapper = new ModelMapper();

        CredencialDTO dto = mapper.map(this, CredencialDTO.class);

        return dto;
    }
}
