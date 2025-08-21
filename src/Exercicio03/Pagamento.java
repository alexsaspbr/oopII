package Exercicio03;

public interface Pagamento {

    void processarPagamento(double valor);

    default void gerarRecibo(double valor) {
        System.out.println("--- RECIBO ---");
        System.out.printf("Pagamento de R$ %.2f processado com sucesso.%n", valor);
        System.out.println("----------------");
    }

    static boolean validarValor(double valor) {
        return valor > 0;
    }
}
