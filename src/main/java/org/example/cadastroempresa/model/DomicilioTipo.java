package org.example.cadastroempresa.model;

import jakarta.persistence.Embeddable;

@Embeddable
public enum DomicilioTipo {

    RESIDENCIAL,

    COMERCIAL,

    AMBOS;
}
