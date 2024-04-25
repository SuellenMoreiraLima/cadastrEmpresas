package org.example.cadastroempresa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.example.cadastroempresa.dto.CadastroDTO;
import org.example.cadastroempresa.dto.PessoaDTO;
import org.modelmapper.ModelMapper;

@Entity
@Table(name = "cadastro")
@AllArgsConstructor
@NoArgsConstructor
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(insertable=false, updatable=false)
    private String email;

    @Column(insertable=false, updatable=false)
    private String nomeFantasia;

    @Column(insertable=false, updatable=false)
    private String sobrenomeSocial;

    @Column(insertable=false, updatable=false)
    private boolean empresa;

    @Embedded
    private Credencial credencial;

    @Embedded
    private Parceiro parceiro;

    @Embedded
    private Documentacao documentacao;

    @Embedded
    private Identificacao identificacao;

    @Embedded
    private Endereco endereco;

    @OneToOne
    private Pessoa pessoa;

    @Embedded
    private Telefone telefone;

    @Embedded
    private Inscrito inscrito;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public boolean isEmpresa() {
        return empresa;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }

    public String getSobrenomeSocial() {
        return sobrenomeSocial;
    }

    public void setSobrenomeSocial(String sobrenomeSocial) {
        this.sobrenomeSocial = sobrenomeSocial;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    public Parceiro getParceiro() {
        return parceiro;
    }

    public void setParceiro(Parceiro parceiro) {
        this.parceiro = parceiro;
    }

    public Identificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Identificacao identificacao) {
        this.identificacao = identificacao;
    }

    public Documentacao getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(Documentacao documentacao) {
        this.documentacao = documentacao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Inscrito getInscrito() {
        return inscrito;
    }

    public void setInscrito(Inscrito inscrito) {
        this.inscrito = inscrito;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public CadastroDTO toDTO() {
        ModelMapper mapper = new ModelMapper();

        CadastroDTO dto = mapper.map(this, CadastroDTO.class);

        return dto;
    }
}
