package org.example.cadastroempresa.dto;

import org.example.cadastroempresa.model.*;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class CadastroDTO {

    private int id;
    private String email;
    private String nomeFantasia;
    private String sobrenomeSocial;
    private String empresa;

    public Cadastro toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Cadastro.class);
    }

}
