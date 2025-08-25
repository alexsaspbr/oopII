package exercios.interfaces.questao05;

public class SmsNotificacao implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}

