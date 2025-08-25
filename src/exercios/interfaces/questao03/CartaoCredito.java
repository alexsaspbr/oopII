package exercios.interfaces.questao03;

public class CartaoCredito implements Pagamento {

    @Override
    public double processarPagamento(double valor) {
        if (Pagamento.validarValor(valor)) {
            double taxaJuros = 0.05; // Exemplo de taxa de juros de 5%
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
