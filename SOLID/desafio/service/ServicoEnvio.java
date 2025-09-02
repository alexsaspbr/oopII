package desafio.service;

import desafio.Pedido;

public class ServicoEnvio {
    public boolean enviarPedido(Pedido pedido) {
        if (pedido.getStatus().equals("Pago")) {
            // Utiliza o método de envio escolhido
            double custoEnvio = pedido.getCustoEnvio();
            System.out.println("Pedido enviado com custo de envio: R$" + custoEnvio);
            pedido.setStatus("Enviado");
            return true;
        } else {
            System.out.println("Não é possível enviar um pedido não pago");
            return false;
        }
    }
}
