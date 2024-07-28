package org.teste;

import org.consulta.NotaFilme;
import org.infra.DAO;
import org.relacionamentos.Ator;
import org.relacionamentos.Filme;

import java.util.List;

public class Consulta {
    public static void main(String[] args) {
        DAO<Filme> dao =  new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.5);

        for(Filme filme : filmes){
            System.out.println(filme.getNome() + "=> " +filme.getNota());
            for (Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }

        DAO<NotaFilme> dao2 =  new DAO<>(NotaFilme.class);
        NotaFilme nota = dao2.consultarUm("obterMediaGeralDosFilmes");
        System.out.println(nota.getMedia());
        dao2.fechar();
    }

}
