package desafioInterfacesJava.Exercicio3;

public class CartaoCredito implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {

            System.out.println("Processando pagamento de R$ " + valor + " com cartão de crédito.");
            gerarRecibo(valor);
        } else {
            System.out.println("Valor inválido para pagamento com cartão de crédito.");
        }
    }
}