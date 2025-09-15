package Desafio3.loja.interfaces;

import Desafio3.loja.model.Pedido;

public interface ServicoEnvio {
    boolean enviarPedido(Pedido pedido);
}
