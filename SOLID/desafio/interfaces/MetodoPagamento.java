package desafio.interfaces;

import desafio.Pedido;

public interface MetodoPagamento {
    boolean processarPagamento(Pedido pedido);
    String getDescricao();
}