package exercicios.ex5;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private List<Notificacao> notificadores;
    
    public GerenciadorDeNotificacoes(List<Notificacao> notificadores) {
        this.notificadores = notificadores;
    }
    
    public void notificarTodos(String mensagem) {
        System.out.println("=== Iniciando envio de notificações ===");
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Canais de notificação: " + notificadores.size());
        System.out.println();
        
        for (int i = 0; i < notificadores.size(); i++) {
            Notificacao notificador = notificadores.get(i);
            System.out.println("--- Canal " + (i + 1) + " ---");
            notificador.enviar(mensagem);
            System.out.println();
        }
        
        System.out.println("=== Todas as notificações foram enviadas ===");
    }
    
    public void adicionarNotificador(Notificacao notificador) {
        notificadores.add(notificador);
    }
    
    public void removerNotificador(Notificacao notificador) {
        notificadores.remove(notificador);
    }
    
    public List<Notificacao> getNotificadores() {
        return notificadores;
    }
}
