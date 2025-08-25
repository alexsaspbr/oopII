package exercios.interfaces.questao05;

public class EmailNotificacao implements Notification {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}

