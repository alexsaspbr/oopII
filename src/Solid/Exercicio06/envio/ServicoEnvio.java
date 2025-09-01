package Solid.Exercicio06.envio;

import Solid.Exercicio06.pedido.Pedido;

// ISP: Interface específica para serviços de envio
public interface ServicoEnvio {
    void enviarPedido(Pedido pedido);
}
