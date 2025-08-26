package exercicio;

public class PushNotificacao implements Notificacao{
  @Override
  public void enviar(String mensagem) {
    System.out.println("[Push] Enviando: " +  mensagem);
  }
}

