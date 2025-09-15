package Desafio3.loja.pagamento;

import Desafio3.loja.interfaces.CalculadorDesconto;
import Desafio3.loja.interfaces.ProcessadorPagamento;

public class PagamentoCriptomoeda implements ProcessadorPagamento, CalculadorDesconto {
    @Override
    public boolean processarPagamento(double valor) {
            System.out.println("Processando pagamento em criptomoeda: R$ " + valor);
            return true;

    }

    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.08;
    }
}
