package org.teste;

import org.example.Produto;
import org.infra.DAO;

public class ProdutoTeste {
    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto(50.99, "CS");

        dao.abrirT().incluir(produto).fecharT().fechar();
    }
}
