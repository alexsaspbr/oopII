package exercicios.ex5.desconto;

public class DescontoCupom implements Desconto {
    private final java.math.BigDecimal valorCupom;

    public DescontoCupom(java.math.BigDecimal valorCupom) {
        this.valorCupom = valorCupom;
    }

    @Override
    public java.math.BigDecimal desconto(java.math.BigDecimal valor) {
        return valorCupom;
    }
}
