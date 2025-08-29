package ExercicioFinal6.notificacao;

public class NotificadorSMS implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação por SMS: " + mensagem);

    }
}
