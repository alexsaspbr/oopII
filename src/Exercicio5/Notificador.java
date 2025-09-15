package Exercicio5;

class Notificador {
    private IServicoNotificacao servicoNotificacao;

    public Notificador(IServicoNotificacao servicoNotificacao) {
        this.servicoNotificacao = servicoNotificacao;
    }

    public void notificar(String destinatario ,String mensagem) {
        servicoNotificacao.enviar(destinatario, "Notificação", mensagem);
    }

    public void trocarServico(IServicoNotificacao novoServico) {
        this.servicoNotificacao = novoServico;
    }
}
