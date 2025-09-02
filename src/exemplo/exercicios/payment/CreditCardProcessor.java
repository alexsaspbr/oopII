package exemplo.exercicios.payment;

import exemplo.exercicios.order.Order;

public class CreditCardProcessor implements PaymentProcessor {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;

    public CreditCardProcessor(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(Order order, double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Card ending with: " + cardNumber.substring(cardNumber.length() - 4));
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
}
