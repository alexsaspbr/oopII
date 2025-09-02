package exercicios.ex5.pagamento;

public class PagamentoBoleto implements Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean pagar(java.math.BigDecimal valor) {
        return true;
    }
}
