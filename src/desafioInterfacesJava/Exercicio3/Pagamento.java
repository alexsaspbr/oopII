package desafioInterfacesJava.Exercicio3;

public interface Pagamento {
    // Método para processar o pagamento
    void processarPagamento(double valor);

    // Método default para gerar um recibo
    default void gerarRecibo(double valor) {
        System.out.println("Recibo: Pagamento de R$ " + valor + " processado com sucesso.");
    }

    // Método static para validar o valor
    static boolean validarValor(double valor) {
        return valor > 0;
    }
}