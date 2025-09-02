package loja;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Notebook", 3500.0, "João Silva");

        Pagamento pagamento = new PagamentoCartao();
        boolean pago = pagamento.processar(pedido);

        if (pago) {
            Envio envio = new EnvioCorreios();
            envio.enviar(pedido);
        } else {
            System.out.println("Pagamento não aprovado. Pedido não será enviado.");
        }
    }
}

