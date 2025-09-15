package Exercicio1;

class EnviadorRelatorio {
    private final ServicoEmail servicoEmail;
    private final FormatadorRelatorio formatador;

    public EnviadorRelatorio(ServicoEmail servicoEmail, FormatadorRelatorio formatador) {
        this.servicoEmail = servicoEmail;
        this.formatador = formatador;
    }

    public boolean enviarRelatorioPorEmail(String relatorio, String destinatario, String assunto) {
        String conteudoFormatado = formatador.formatarParaEmail(relatorio);
        return servicoEmail.enviarEmail(destinatario, assunto, conteudoFormatado);
    }
}
