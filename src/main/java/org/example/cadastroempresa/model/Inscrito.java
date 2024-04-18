package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Inscrito {

    private boolean assinante;

    private boolean associado;

    private boolean afiliado;

    public boolean isAssinante() {
        return assinante;
    }

    public void setAssinante(boolean assinante) {
        this.assinante = assinante;
    }

    public boolean isAssociado() {
        return associado;
    }

    public void setAssociado(boolean associado) {
        this.associado = associado;
    }

    public boolean isAfiliado() {
        return afiliado;
    }

    public void setAfiliado(boolean afiliado) {
        this.afiliado = afiliado;
    }
}
