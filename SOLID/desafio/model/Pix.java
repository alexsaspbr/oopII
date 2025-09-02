package desafio.model;

import desafio.interfaces.MetodoPagamento;

public class Pix implements MetodoPagamento {
    @Override
    public boolean processarPagamento(Pedido pedido) {
        System.out.println("Processando pagamento via Pix...");
        // Lógica de processamento de pagamento via Pix
        pedido.setStatus("PAGO");
        return true;
    }

    @Override
    public String getDescricao() {
        return "Pix";
    }
}