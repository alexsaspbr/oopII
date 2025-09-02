package desafio.service;

import desafio.Pedido;

public class ProcessadorPagamento {
    public boolean processar(Pedido pedido) {
        // Delega o processamento para o método de pagamento escolhido
        boolean pagamentoProcessado = pedido.getMetodoPagamento().processarPagamento(pedido);
        if (pagamentoProcessado) {
            pedido.setStatus("Pago");
            System.out.println("Pagamento processado com sucesso via " + pedido.getMetodoPagamento().getDescricao());
        } else {
            System.out.println("Falha no processamento do pagamento");
        }
        return pagamentoProcessado;
    }
}