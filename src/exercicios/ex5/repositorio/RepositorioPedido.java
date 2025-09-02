package exercicios.ex5.repositorio;

import exercicios.ex5.modelo.Pedido;

import java.util.List;

public class RepositorioPedido {
    List<Pedido> pedidos;
    static int ID = 0;

    public RepositorioPedido() {
        this.pedidos = new java.util.ArrayList<>();
    }

    public Pedido criarPedido() {
        Pedido pedido = new Pedido(ID);
        this.pedidos.add(pedido);
        ID++;
        return pedido;
    }

    public List<Pedido> listarPedidos() {
        return this.pedidos;
    }
}
