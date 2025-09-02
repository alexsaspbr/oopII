package exemplo.exercicios.payment;

import exemplo.exercicios.order.Order;

public interface PaymentProcessor {
    boolean processPayment(Order order, double amount);
    String getPaymentMethod();
}
