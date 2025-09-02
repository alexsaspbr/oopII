package desafio6solid;

public class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Pagando R$" + amount + " com cartão: ****" + cardNumber.substring(cardNumber.length() - 4));
        return true;
    }
}