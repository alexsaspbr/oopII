package exercicio5;

public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Mensagem enviada por e-mail: " + mensagem);
    }
}
