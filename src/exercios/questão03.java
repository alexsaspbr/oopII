package exercios;

public interface Pagamento {
    double processarPagamento(double valor);

    default String gerarRecibo(double valor) {
        return "Recibo de pagamento no valor de: " + valor;
    }

    static boolean validarValor(double valor){
        return valor > 0;
    } 
    
}

public class CartaoCredito implements Pagamento {
    private double taxaJuros;

    @Override
    public double processarPagamento(double valor) {
        if (validarValor(valor)) {
            taxaJuros = 0.05; // Exemplo de taxa de juros de 5%
            return valor + (valor * taxaJuros);
        } else {
            throw new IllegalArgumentException("Valor inválido para pagamento.");
        }
    }

    @Override
    public String gerarRecibo(double valor) {
        return "Recibo de pagamento com cartão de crédito no valor de: " + valor;
    }

}

public class Pix implements Pagamento {
    @Override
    public double processarPagamento(double valor) {
        if (!validarValor(valor)) {
            throw new IllegalArgumentException("Valor inválido para pagamento.");
        }
        return valor;
    }

    @Override
    public String gerarRecibo(double valor) {
        return "Recibo de pagamento via Pix no valor de: " + valor;
    }
    
}