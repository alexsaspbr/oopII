package Exercicio05;

public class EmailNotificacao implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Enviando e-mail: " + mensagem);
    }
}
