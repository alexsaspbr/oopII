package com.lojaonline.notificacao;

public class NotificadorSMS implements Notificador{
  @Override
  public void notificar(String mensagem) {
    System.out.println("Enviando notificação por SMS: " + mensagem);

  }

}
