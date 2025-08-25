package exercicio3;

public class Pix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Processando pagamento de R$ " + valor + " via PIX.");
            gerarRecibo(valor);
        } else {
            System.out.println("Valor inválido para pagamento via PIX.");
        }
    }
}
