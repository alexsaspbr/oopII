package Desafio3.loja.notificacao;

import Desafio3.loja.interfaces.NotificadorCliente;

public class NotificadorSMS implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
