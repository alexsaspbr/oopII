import desafio6solid.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA SIMPLIFICADO DE PEDIDOS ===\n");

        // Criar pedido
        Order order = new Order("ORD-001", "joao@email.com", 150.50);

       

        // Caso 1: Cartão + Correios + Email
        System.out.println("1. Pagamento com cartão + Correios + Email:");
        Payment cardPayment = new CreditCardPayment("1234567812345678");
        Shipping correios = new CorreiosShipping();
        Notification email = new EmailNotification();

        OrderProcessor processor1 = new OrderProcessor(cardPayment, correios, email);
        processor1.process(order);

        System.out.println();

        // Caso 2: PIX + Expresso + SMS (novos métodos sem alterar código existente)
        System.out.println("2. Pagamento com PIX + Expresso + SMS:");
        Payment pixPayment = new PixPayment("123.456.789-00");
        Shipping express = new ExpressShipping();
        Notification sms = new SMSNotification();

        OrderProcessor processor2 = new OrderProcessor(pixPayment, express, sms);
        processor2.process(order);

        System.out.println();

        // Caso 3: Mix de implementações
        System.out.println("3. Pagamento com cartão + Expresso + SMS:");
        OrderProcessor processor3 = new OrderProcessor(cardPayment, express, sms);
        processor3.process(order);
    }
}