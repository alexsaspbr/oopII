package ExercicioFinal6.notificacao;

public class NotificadorEmail implements Notificacao {
    @Override
    public void notificar(String mensagem) {
        System.out.println("Enviando notificação por Email: " + mensagem);

    }
}
