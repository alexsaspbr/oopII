package exercicio3;

public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Processando pagamento de R$ " + valor + " no Cartão de Crédito.");
            gerarRecibo(valor);
        } else {
            System.out.println("Valor inválido para pagamento no Cartão de Crédito.");
        }
    }
}
