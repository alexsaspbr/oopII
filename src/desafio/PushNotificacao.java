package desafio;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificaçao Push: \"" + mensagem + "\"");
    }
}
