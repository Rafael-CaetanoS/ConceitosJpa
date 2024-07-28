package org.heranca;

import javax.persistence.Entity;

@Entity
public class Gerente extends Pessoa{

    private String login;
    private String senha;


    public Gerente(String nome, int idade, String login, String senha) {
        super(nome, idade);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
