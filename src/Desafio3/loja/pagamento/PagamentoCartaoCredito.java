package Desafio3.loja.pagamento;

import Desafio3.loja.interfaces.CalculadorDesconto;
import Desafio3.loja.interfaces.ProcessadorPagamento;

public class PagamentoCartaoCredito implements ProcessadorPagamento, CalculadorDesconto {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento cartão de credito: R$ " + valor);
        return valor > 0;
    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.02;
    }
}
