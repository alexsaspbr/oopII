package desafio6solid;

public class EmailNotification implements Notification {
    @Override
    public void send(String message, String customer) {
        System.out.println("Email para " + customer + ": " + message);
    }
}
