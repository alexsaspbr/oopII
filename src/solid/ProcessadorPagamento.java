package solid;

public class ProcessadorPagamento {
    public boolean processar(Pedido pedido, MetodoPagamento metodoPagamento) {
        System.out.println("Iniciando processamento de pagamento para o pedido...");
        return metodoPagamento.processarPagamento(pedido.getValorTotal());
    }
}

