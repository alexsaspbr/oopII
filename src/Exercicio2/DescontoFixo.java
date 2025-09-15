package Exercicio2;

class DescontoFixo implements CalculadorDesconto {
    private final double valorFixo;

    public DescontoFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }

    @Override
    public double calcular(double valor) {
        return valorFixo;
    }

    @Override
    public String getTipo() {
        return "Desconto Fixo: R$ " + valorFixo;
    }
}
