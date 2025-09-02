package desafio.model;

import desafio.interfaces.MetodoPagamento;
import desafio.Pedido;

public class PayPal implements MetodoPagamento {
    @Override
    public boolean processarPagamento(Pedido pedido) {
        // Simulação de processamento de pagamento com PayPal
        System.out.println("Processando pagamento com PayPal no valor de R$" + pedido.getValorTotal());
        return true; // Simulando sucesso no pagamento
    }

    @Override
    public String getDescricao() {
        return "PayPal";
    }
}
