package exercicio5;

public class SmsNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por sms: " + mensagem);
    }
}
