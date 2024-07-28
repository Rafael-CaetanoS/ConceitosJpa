package org.relacionamentos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name="filmes")
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nome_filme")
    private String nome;

    private  Double nota;
    @ManyToMany (cascade = CascadeType.PERSIST)
    @JoinTable (name = "atores_filmes", joinColumns = @JoinColumn(name = "filme_id", referencedColumnName ="id" ),
            inverseJoinColumns = @JoinColumn (name = "ator_id", referencedColumnName = "id")

    )
    private List<Ator> atores;

    public Filme() {
    }

    public Filme(Double nota, String nome) {
        this.nota = nota;
        this.nome = nome;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionarAtor(Ator ator){
        if (ator != null && !getAtores().contains(ator)){
            getAtores().add(ator);
            if(!ator.getFilmes().contains(this)){
                ator.getFilmes().add(this);
            }
        }
    }
}
