package org.relacionamentos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tio_nome")
    private String nome;

    public List<Sobrinho> getSobrinhos() {
        return sobrinhos;
    }

    public void setSobrinhos(List<Sobrinho> sobrinhos) {
        this.sobrinhos = sobrinhos;
    }

    @ManyToMany
    public List<Sobrinho> sobrinhos = new ArrayList<>();

    public Tio() {

    }
    public Tio(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
