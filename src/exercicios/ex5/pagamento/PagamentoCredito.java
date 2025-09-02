package exercicios.ex5.pagamento;

import java.math.BigDecimal;

public class PagamentoCredito implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String cvv;

    public PagamentoCredito(String numeroCartao, String nomeTitular, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public boolean pagar(BigDecimal valor) {
        return true;
    }
}
