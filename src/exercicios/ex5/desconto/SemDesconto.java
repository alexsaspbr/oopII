package exercicios.ex5.desconto;

public class SemDesconto implements Desconto{
    @Override
    public java.math.BigDecimal desconto(java.math.BigDecimal valor) {
        return java.math.BigDecimal.ZERO;
    }
}
