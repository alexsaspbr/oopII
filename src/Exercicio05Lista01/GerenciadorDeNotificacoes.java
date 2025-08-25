package Exercicio05Lista01;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private final List<Notificacao> canaisDeNotificacao;

    // Construtor que recebe a lista de notificadores.
    // Isso é a Injeção de Dependência: a classe não cria suas dependências, ela as recebe prontas.
    // canais - A lista de canais que devem ser notificados.
    public GerenciadorDeNotificacoes(List<Notificacao> canais) {
        this.canaisDeNotificacao = canais;
    }

    // Itera sobre todos os canais configurados e envia a mensagem para cada um.
    // mensagem - A mensagem a ser enviada.

    public void notificarTodos(String mensagem) {
        if (canaisDeNotificacao == null || canaisDeNotificacao.isEmpty()) {
            System.out.println("Nenhum canal de notificação foi configurado.");
            return;
        }

        System.out.println("\n--- Disparando notificações ---");
        for (Notificacao canal : canaisDeNotificacao) {
            canal.enviar(mensagem);
        }
        System.out.println("-----------------------------\n");
    }
}