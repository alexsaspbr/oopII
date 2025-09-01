package Solid.Exercicio06.envio;

import Solid.Exercicio06.pedido.Pedido;

public class EnvioCorreios implements ServicoEnvio {
    @Override
    public void enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido pelos Correios...");
        // Lógica de envio pelos Correios
    }
}
