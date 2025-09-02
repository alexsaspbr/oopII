package desafio.interfaces;

import desafio.Pedido;

public interface GerenciadorPedidos {
    void adicionarPedido(Pedido pedido);
    void cancelarPedido(String idPedido);
    Pedido buscarPedido(String idPedido);
    void atualizarStatusPedido(String idPedido, String novoStatus);
}