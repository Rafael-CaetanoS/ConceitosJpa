package org.teste;

import org.example.ItemPedido;
import org.example.Pedido;
import org.example.Produto;
import org.infra.DAO;

public class OneToMany {
    public static void main(String[] args) {


     /*
       DAO<Object> dao = new DAO<>();
      Produto produto = new Produto(1200.00, "MotoG");
        Pedido pedido = new Pedido();
        ItemPedido item = new ItemPedido(5,pedido, produto);

        dao.abrirT()
                .incluir(produto)
                .incluir(pedido)
                .incluir(item)
                .fecharT()
                .fechar();
                */


        DAO<Pedido> daoPedido = new DAO<>(Pedido.class);
        Pedido pedido = daoPedido.obterPorID(1L);
        for (ItemPedido item: pedido.getItens()){
            System.out.println(item.getQuantidade());
        }
    }
}
