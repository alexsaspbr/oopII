package exemplo.exercicios;

import exemplo.exercicios.order.Order;
import exemplo.exercicios.order.OrderItem;
import exemplo.exercicios.order.OrderProcessingService;
import exemplo.exercicios.payment.CreditCardProcessor;
import exemplo.exercicios.payment.PayPalProcessor;
import exemplo.exercicios.shipping.ExpressShippingService;
import exemplo.exercicios.shipping.StandardShippingService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderItem item1 = new OrderItem("P001", "Smartphone", 499.99, 1);
        OrderItem item2 = new OrderItem("P042", "Wireless Earbuds", 79.99, 2);
        Order order1 = new Order("ORD123", List.of(item1, item2));
        
        System.out.println("=== Processing Order with Credit Card & Standard Shipping ===");
        var creditCardProcessor = new CreditCardProcessor(
            "4111111111111111", 
            "JOHN DOE", 
            "12/25", 
            "123"
        );
        var standardShipping = new StandardShippingService();
        
        var orderService1 = new OrderProcessingService(creditCardProcessor, standardShipping);
        orderService1.processOrder(order1);
        
        System.out.println("\n=== Processing Another Order with PayPal & Express Shipping ===");
        OrderItem item3 = new OrderItem("P156", "Laptop", 1299.99, 1);
        Order order2 = new Order("ORD124", List.of(item3));
        
        var payPalProcessor = new PayPalProcessor("customer@example.com", "password123");
        var expressShipping = new ExpressShippingService();
        
        var orderService2 = new OrderProcessingService(payPalProcessor, expressShipping);
        orderService2.processOrder(order2);
        
        System.out.println("\n=== Demonstrating Free Shipping with Standard Shipping ===");
        OrderItem item4 = new OrderItem("P200", "4K Smart TV", 899.99, 1);
        Order order3 = new Order("ORD125", List.of(item4));
        
        var orderService3 = new OrderProcessingService(creditCardProcessor, standardShipping);
        orderService3.processOrder(order3);
    }
}
