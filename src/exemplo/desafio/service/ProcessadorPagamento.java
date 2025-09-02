package exemplo.desafio.service;

import exemplo.desafio.model.Pedido;

public class ProcessadorPagamento {
    public void processar(Pedido pedido) {
        double total = pedido.calcularTotal();
        boolean sucesso = pedido.getMetodoPagamento().processarPagamento(total);
        if (sucesso) {
            pedido.setStatus("Pago");
            System.out.println("Pagamento aprovado.");
        } else {
            pedido.setStatus("Falha no Pagamento");
            System.out.println("Pagamento recusado.");
        }
    }
}