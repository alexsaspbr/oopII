package solid;

public class Paypal implements MetodoPagamento {
    @Override
    public boolean processarPagamento(double valor) {
        // Lógica real de processamento via PayPal
        System.out.println("Processando pagamento via PayPal...");
        return true;
    }
}
