package exercicios.ex5.desconto;

public class DescontoFixo implements Desconto{
    private final java.math.BigDecimal valorDesconto;

    public DescontoFixo(java.math.BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public java.math.BigDecimal desconto(java.math.BigDecimal valor) {
        return valorDesconto;
    }
}
