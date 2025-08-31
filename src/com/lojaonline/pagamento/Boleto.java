package com.lojaonline.pagamento;

public class Boleto implements MetodoPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado e compensado: R$ " + valor);
    }
}
