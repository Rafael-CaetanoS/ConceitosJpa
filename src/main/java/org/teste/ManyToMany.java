package org.teste;

import org.infra.DAO;
import org.relacionamentos.Ator;
import org.relacionamentos.Filme;
import org.relacionamentos.Sobrinho;
import org.relacionamentos.Tio;

public class ManyToMany {
    public static void main(String[] args) {
      /*  Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("Carlos");

        Sobrinho sob1 = new Sobrinho("Rafael");
        Sobrinho sob2 = new Sobrinho("Suellen");

        tia1.getSobrinhos().add(sob1);
        sob1.getTios().add(tia1);

        tio2.getSobrinhos().add(sob2);
        sob2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sob1)
                .incluir(sob2)
                .fecharT().fechar();
*/
        Filme filmeA = new Filme (8.7,"star wars");
        Filme filmeb = new Filme (8.7,"gente grande");

        Ator atorA = new Ator("Serjão dos foguetes");
        Ator atorb = new Ator("xandão");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atorb);

        filmeb.adicionarAtor(atorb);

        DAO<Filme> dao = new DAO<>();

        dao.incluirAtomico(filmeA);





    }
}
