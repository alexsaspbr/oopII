package Exercicio5;

class MockNotificationService implements IServicoNotificacao{
    private String ultimoDestinatario;
    private String ultimoAssunto;
    private String ultimaMensagem;
    private boolean foiChamado = false;

    @Override
    public void enviar(String destinatario, String assunto, String mensagem) {
        this.ultimoDestinatario = destinatario;
        this.ultimoAssunto = assunto;
        this.ultimaMensagem = mensagem;
        this.foiChamado = true;
        System.out.println("MOCK: Notificação capturada para teste");
    }

    public String getUltimoDestinatario() {
        return ultimoDestinatario;
    }

    public String getUltimoAssunto() {
        return ultimoAssunto;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }

    public boolean isFoiChamado() {
        return foiChamado;
    }
}
