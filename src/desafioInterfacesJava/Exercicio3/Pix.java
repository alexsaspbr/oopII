package desafioInterfacesJava.Exercicio3;

public class Pix implements Pagamento {
    @Override
    public void processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            // Lógica para processar o pagamento via Pix
            System.out.println("Processando pagamento de R$ " + valor + " via Pix.");
            gerarRecibo(valor); // Chama o método default para gerar o recibo
        } else {
            System.out.println("Valor inválido para pagamento via Pix.");
        }
    }
}
