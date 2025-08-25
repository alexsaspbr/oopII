package exercios.interfaces.questao03;

public class Pix implements Pagamento {
    @Override
    public double processarPagamento(double valor) {
        if (!Pagamento.validarValor(valor)) {
            throw new IllegalArgumentException("Valor inválido para pagamento.");
        }
        return valor;
    }

    @Override
    public String gerarRecibo(double valor) {
        return "Recibo de pagamento via Pix no valor de: " + valor;
    }
    
}
