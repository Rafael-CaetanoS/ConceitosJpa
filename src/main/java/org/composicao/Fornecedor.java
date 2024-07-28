package org.composicao;

import javax.persistence.*;

@Entity
@Table(name="fornecedores")
public class Fornecedor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;

    private  Endereco endereco;

    public Fornecedor() {

    }

    public Fornecedor(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


}
