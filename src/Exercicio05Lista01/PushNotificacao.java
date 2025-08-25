package Exercicio05Lista01;


public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        // Lógica real para enviar uma notificação push (ex: para Firebase, APNS) seria aqui.
        System.out.println("Enviando Notificação PUSH: \"" + mensagem + "\"");
    }
}
