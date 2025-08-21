package Exercicio03;

public class CartaoDeCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Processando R$ " + valor + " no cartão de crédito...");
            // Lógica específica para pagamento com cartão
            System.out.println("Pagamento aprovado!");
            gerarRecibo(valor); // Chama o método default da interface
        } else {
            System.out.println("Valor inválido. O pagamento não pode ser processado.");
        }

    }
}