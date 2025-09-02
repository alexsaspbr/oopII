package exemplo.exercicios.order;

import exemplo.exercicios.payment.PaymentProcessor;
import exemplo.exercicios.shipping.ShippingService;

public class OrderProcessingService {
    private PaymentProcessor paymentProcessor;
    private ShippingService shippingService;

    public OrderProcessingService(PaymentProcessor paymentProcessor, ShippingService shippingService) {
        this.paymentProcessor = paymentProcessor;
        this.shippingService = shippingService;
    }

    public boolean processOrder(Order order) {
        System.out.println("\nProcessing order: " + order.getOrderId());
        
        double subtotal = order.calculateTotal();
        double shippingCost = shippingService.calculateShippingCost(order);
        double total = subtotal + shippingCost;
        
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Shipping (%s): $%.2f%n", shippingService.getShippingMethod(), shippingCost);
        System.out.printf("Total: $%.2f%n", total);
        
        System.out.println("Processing payment via: " + paymentProcessor.getPaymentMethod());
        boolean paymentSuccess = paymentProcessor.processPayment(order, total);
        
        if (paymentSuccess) {
            System.out.println("Payment successful!");
            order.setStatus(OrderStatus.PAID);
            
            shippingService.shipOrder(order);
            order.setStatus(OrderStatus.SHIPPED);
            
            System.out.println("Order processed successfully!");
            return true;
        } else {
            System.out.println("Payment failed. Order not processed.");
            order.setStatus(OrderStatus.CANCELLED);
            return false;
        }
    }
}
