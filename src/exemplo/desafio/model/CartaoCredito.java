package exemplo.desafio.model;

import exemplo.desafio.interfaces.MetodoPagamento;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("Processando R$%.2f com Cartão de Crédito.%n", valor);
        return true;
    }
}
