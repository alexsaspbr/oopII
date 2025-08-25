package exercios.interfaces.questao03;

public interface Pagamento {
    double processarPagamento(double valor);

    default String gerarRecibo(double valor) {
        return "Recibo de pagamento no valor de: " + valor;
    }

    static boolean validarValor(double valor){
        return valor > 0;
    } 
    
}

