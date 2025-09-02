package solid;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        // Lógica real de processamento de cartão de crédito
        System.out.println("Processando pagamento via Cartão de Crédito...");
        return true;
    }
}