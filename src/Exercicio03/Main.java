package Exercicio03;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando simulação de pagamentos...");

        // Testando pagamento com Cartão de Crédito
        System.out.println("\n--- Pagamento com Cartão de Crédito ---");
        Pagamento cartao = new CartaoDeCredito();
        cartao.processarPagamento(150.75);

        // Testando pagamento com Pix
        System.out.println("\n--- Pagamento com Pix ---");
        Pagamento pix = new Pix();
        pix.processarPagamento(200.50);

        // Testando o método estático com valor inválido
        System.out.println("\n--- Tentativa de Pagamento com Valor Inválido ---");
        cartao.processarPagamento(-50.0);

        // Chamando o método estático diretamente da interface
        System.out.println("\n--- Verificando Validade de Valores ---");
        System.out.println("O valor 100.0 é válido? " + Pagamento.validarValor(100.0));
        System.out.println("O valor -10.0 é válido? " + Pagamento.validarValor(-10.0));
    }
}