package org.heranca;

import org.infra.DAO;

public class TesteHeranç {
    public static void main(String[] args) {
        DAO<Gerente> dao = new DAO<>();
        Gerente gerente = new Gerente("rafael2 ", 24, "rafael teste", "rafael123" );

        dao.incluirAtomico(gerente);
    }
}
