package exercicios.ex5.desconto;

public class DescontoProporcional implements Desconto{
    private final java.math.BigDecimal percentual;

    public DescontoProporcional(java.math.BigDecimal percentual) {
        this.percentual = percentual;
    }

    @Override
    public java.math.BigDecimal desconto(java.math.BigDecimal valor) {
        return valor.multiply(percentual).divide(new java.math.BigDecimal("100"));
    }
}
