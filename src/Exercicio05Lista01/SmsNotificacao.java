package Exercicio05Lista01;


public class SmsNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        // Lógica real para enviar um SMS via gateway seria aqui.
        System.out.println("Enviando SMS: \"" + mensagem + "\"");
    }
}