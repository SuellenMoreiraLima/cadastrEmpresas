package org.example.cadastroempresa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadastro")
@AllArgsConstructor
@NoArgsConstructor
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String email;

    private String nomeFantasia;

    private String sobrenomeSocial;

    private boolean empresa;

//    @Embedded
//    private Credencial credencial;
//
//    @Embedded
//    private Parceiro parceiro;
//
//    @Embedded
//    private Documentacao documentacao;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="empresa", column=@Column(name="empresa")),})
//    private Identificacao identificacao;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name="numero", column=@Column(name="endereco_numero")),
//            @AttributeOverride(name="cidade", column=@Column(name="endereco_cidade"))
//    })
//    private Endereco endereco;
//
//    @OneToOne
//    private Pessoa pessoa;
//
//    @Embedded
//    private Telefone telefone;
//
//    @Embedded
//    private Inscrito inscrito;


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
}
