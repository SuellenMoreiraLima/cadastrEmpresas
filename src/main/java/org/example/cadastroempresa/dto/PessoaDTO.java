package org.example.cadastroempresa.dto;

import org.example.cadastroempresa.model.Domicilio;
import org.example.cadastroempresa.model.Pessoa;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class PessoaDTO {

    private int id;
    private String cpfCnpj;
    private String nome;
    private String nomeFantasia;
    private String email;
    private Date aniversario;
    private String token ;
    private String telefone;

    public Pessoa toEntity() {

        ModelMapper mapper = new ModelMapper();

        return mapper.map(this, Pessoa.class);
    }

}
