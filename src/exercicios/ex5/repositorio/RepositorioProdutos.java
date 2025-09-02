package exercicios.ex5.repositorio;

import exercicios.ex5.modelo.Produto;

import java.util.ArrayList;
import java.util.List;

public class RepositorioProdutos {
    List<Produto> produtos;

    public RepositorioProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
