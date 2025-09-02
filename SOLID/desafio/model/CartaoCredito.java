package desafio.model;

import desafio.interfaces.MetodoPagamento;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public boolean processarPagamento(Pedido pedido) {
        // Simulação de processamento de pagamento com cartão de crédito
        System.out.println("Processando pagamento com Cartão de Crédito no valor de R$" + pedido.getValorTotal());
        return true; // Simulando sucesso no pagamento
    }

    @Override
    public String getDescricao() {
        return "Cartão de Crédito";
    }
}
