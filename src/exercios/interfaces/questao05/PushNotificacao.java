package exercios.interfaces.questao05;

public class PushNotificacao implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Push: " + mensagem);
    }
}

