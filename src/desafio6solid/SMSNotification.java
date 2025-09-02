package desafio6solid;

public class SMSNotification implements Notification {
    @Override
    public void send(String message, String customer) {
        System.out.println("SMS para " + customer + ": " + message);
    }
}