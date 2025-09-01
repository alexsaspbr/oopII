package Solid.Exercicio05;

public class NotificadorRefatorado {
    private ServicoNotificacao servicoNotificacao;
    
    public NotificadorRefatorado(ServicoNotificacao servico) {
        this.servicoNotificacao = servico;
    }
    
    public void enviarNotificacao(String mensagem) {
        servicoNotificacao.enviarNotificacao("usuario@exemplo.com", mensagem);
    }
}
