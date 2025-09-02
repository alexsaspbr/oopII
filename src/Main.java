import exercicios.ex5.desconto.DescontoProporcional;
import exercicios.ex5.modelo.Pedido;
import exercicios.ex5.modelo.Produto;
import exercicios.ex5.pagamento.PagamentoPix;
import exercicios.ex5.repositorio.RepositorioPedido;
import exercicios.ex5.repositorio.RepositorioProdutos;


import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Capacete", new BigDecimal("90.00"));
        Produto produto2 = new Produto(2, "Joelheira", new BigDecimal("70.00"));
        Produto produto3 = new Produto(3, "Farol LED", new BigDecimal("30.00"));

        RepositorioProdutos produtos = new RepositorioProdutos();
        produtos.adicionarProduto(produto1);
        produtos.adicionarProduto(produto2);
        produtos.adicionarProduto(produto3);

        RepositorioPedido pedidos = new RepositorioPedido();
        Pedido pedido = pedidos.criarPedido();
        pedido.adicionarItem(produto1, 2);
        pedido.adicionarItem(produto2, 1);
        pedido.adicionarItem(produto3, 2);

        System.out.println(pedido);
        pedido.setDesconto(new DescontoProporcional(new BigDecimal("10")));

        java.math.BigDecimal total = pedido.calcularTotalComDesconto();
        System.out.println("Total com desconto: " + total);
        pedido.setPagamento(new PagamentoPix(total, pedido.getId()));
        pedido.executarPedido();
    }
}