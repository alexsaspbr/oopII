package exercicio;

public class SmsNotificacao implements Notificacao {
  @Override
  public void enviar(String mensagem) {
    System.out.println("[SMS] Enviando: " + mensagem) ;
  }
}
