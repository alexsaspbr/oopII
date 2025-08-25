package exercios.interfaces.questao05;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private final List<Notification> notificadores;

    public GerenciadorDeNotificacoes(List<Notification> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificarTodos(String mensagem) {
        for (Notification n : notificadores) {
            n.enviar(mensagem);
        }
    }
}

