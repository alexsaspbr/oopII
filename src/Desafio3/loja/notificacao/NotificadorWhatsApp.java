package Desafio3.loja.notificacao;

import Desafio3.loja.interfaces.NotificadorCliente;

public class NotificadorWhatsApp implements NotificadorCliente {
    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Whatsapp enviado: " + mensagem);
    }
}
