package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Parceiro {

    private boolean cliente;

    private boolean fornecedor;

    private boolean prestador;

    private boolean colaborador;

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public boolean isFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(boolean fornecedor) {
        this.fornecedor = fornecedor;
    }

    public boolean isPrestador() {
        return prestador;
    }

    public void setPrestador(boolean prestador) {
        this.prestador = prestador;
    }

    public boolean isColaborador() {
        return colaborador;
    }

    public void setColaborador(boolean colaborador) {
        this.colaborador = colaborador;
    }
}
