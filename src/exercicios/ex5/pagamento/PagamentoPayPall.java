package exercicios.ex5.pagamento;

public class PagamentoPayPall implements Pagamento {
    private String email;
    private String senha;

    public PagamentoPayPall(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public boolean pagar(java.math.BigDecimal valor) {
        return true;
    }
}
