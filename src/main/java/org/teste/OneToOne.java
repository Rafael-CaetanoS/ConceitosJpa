package org.teste;

import org.infra.DAO;
import org.relacionamentos.Assento;
import org.relacionamentos.Cliente;

public class OneToOne {
    public static void main(String[] args) {
        /* aula 1

        Assento assento = new Assento("12b");
        Cliente cliente = new Cliente("rafael", assento);

        DAO<Object> dao = new DAO<>();

      dao.abrirT()
              .incluir(assento)
              .incluir(cliente)
              .fecharT().fechar();
*/
      /* aula 2 cria na classe Cliente insert em cascata */
        Assento assento = new Assento("10a");
        Cliente cliente = new Cliente("maria", assento);

       /*
         DAO<Cliente> dao = new DAO<>(Cliente.class);
        dao.incluirAtomico(cliente);*/

    /*aula 3 bidirecional busca*/
        DAO<Cliente> dao = new DAO<>(Cliente.class);
        Cliente clientebusca = dao.obterPorID(1L);
        System.out.println(clientebusca.getAssento().getNome());

        DAO<Assento> dao1 = new DAO<>(Assento.class);
        Assento assentoBusca = dao1.obterPorID(2L);
        System.out.println(assentoBusca.getCliente().getNome());


    }
}
