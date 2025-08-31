package com.lojaonline.pagamento;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento aprovado via Cartão de Crédito: R$ " + valor);
    }
}
