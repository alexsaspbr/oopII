package desafio6solid;

public class PixPayment implements Payment {
    private String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Pagando R$" + amount + " via PIX: " + pixKey);
        return true;
    }
}