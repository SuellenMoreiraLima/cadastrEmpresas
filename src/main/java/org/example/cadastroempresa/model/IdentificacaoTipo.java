package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;

@Embeddable
public enum IdentificacaoTipo {

    EMAIL,

    CELULAR;
}
