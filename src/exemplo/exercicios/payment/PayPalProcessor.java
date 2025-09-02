package exemplo.exercicios.payment;

import exemplo.exercicios.order.Order;

public class PayPalProcessor implements PaymentProcessor {
    private String email;
    private String password;

    public PayPalProcessor(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean processPayment(Order order, double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        System.out.println("Email: " + email);
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
}
