package exemplo.desafio.service;

import exemplo.desafio.model.Pedido;

public class ServicoEnvio {
    public void enviarPedido(Pedido pedido) {
        if ("Pago".equals(pedido.getStatus())) {
            double custoEnvio = pedido.calcularCustoEnvio();
            System.out.printf("Pedido enviado. Custo do envio: R$%.2f%n", custoEnvio);
            pedido.setStatus("Enviado");
        } else {
            System.out.println("Não é possível enviar o pedido antes do pagamento.");
        }
    }
}
