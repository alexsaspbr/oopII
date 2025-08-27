package exercicio;

public class EmailNotificacao implements Notificacao {
  @Override
  public void enviar(String mensagem) {
    System.out.println("[Email] Enviando: " + mensagem);
  }
}
