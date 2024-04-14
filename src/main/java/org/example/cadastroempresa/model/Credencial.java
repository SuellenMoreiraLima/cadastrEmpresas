package org.example.cadastroempresa.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

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
}
