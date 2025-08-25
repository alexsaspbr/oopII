package Exercicio05Lista01;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        // Lógica real para enviar um e-mail seria aqui.
        System.out.println("Enviando E-MAIL: \"" + mensagem + "\"");
    }
}

