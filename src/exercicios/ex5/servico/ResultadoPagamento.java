package exercicios.ex5.servico;

public class ResultadoPagamento {
    private final boolean sucesso;
    private final String mensagem;

    public ResultadoPagamento(boolean sucesso, String mensagem) {
        this.sucesso = sucesso;
        this.mensagem = mensagem;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public String getMensagem() {
        return mensagem;
    }
}
