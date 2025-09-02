package desafio6solid;

public class OrderProcessor {
    private Payment payment;
    private Shipping shipping;
    private Notification notification;

    // Injeção de dependências
    public OrderProcessor(Payment payment, Shipping shipping, Notification notification) {
        this.payment = payment;
        this.shipping = shipping;
        this.notification = notification;
    }

    public boolean process(Order order) {
        try {
            // Processar pagamento
            boolean paymentSuccess = payment.pay(order.getTotal());
            if (!paymentSuccess) {
                return false;
            }

            // Enviar pedido
            shipping.shipOrder(order.getId());

            // Enviar notificação
            notification.send("Seu pedido " + order.getId() + " foi enviado!", order.getCustomer());

            return true;

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }
}