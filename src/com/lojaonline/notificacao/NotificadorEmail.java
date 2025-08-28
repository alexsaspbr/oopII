package com.lojaonline.notificacao;

public class NotificadorEmail implements Notificador{

  @Override
  public void notificar(String mensagem) {
    System.out.println("Enviando notificação por Email: " + mensagem);

  }
}
