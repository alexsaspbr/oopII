package desafio;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private final List<Notificacao> notificadores;

    public GerenciadorDeNotificacoes(List<Notificacao> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificarTodos(String mensagem) {
        if (notificadores == null || notificadores.isEmpty()) {
            System.out.println("Nenhum canal de notificaç~ão configurado.");
            return;
        }

        System.out.println("Iniciando envio de notificações...");
        for (Notificacao notificador : notificadores) {
            notificador.enviar(mensagem);
        }
        System.out.println("Notificacões enviadas com sucesso!");
    }
}