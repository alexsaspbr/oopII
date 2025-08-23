package Desafio5;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação push: " + mensagem);
    }

}
