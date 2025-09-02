package exemplo.desafio.model;

import exemplo.desafio.interfaces.MetodoPagamento;

public class PayPal implements MetodoPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Processando R$%.2f com PayPal.%n", valor);
        return true;
    }
}
