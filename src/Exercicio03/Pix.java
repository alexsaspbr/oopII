package Exercicio03;

public class Pix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            System.out.println("Processando R$ " + valor + " via Pix...");
            // Lógica específica para pagamento com Pix
            System.out.println("Pagamento concluído!");
            gerarRecibo(valor); // Chama o método default da interface
        } else {
            System.out.println("Valor inválido. O pagamento não pode ser processado.");
        }
    }
}
