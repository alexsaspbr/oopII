package Exercicio2;

public class DescontoPercentual implements CalculadorDesconto{
    private final double percentual;

    public  DescontoPercentual(double percentual) {
        this.percentual = percentual;
    }

    @Override
    public double calcular(double valor) {
        return valor * (percentual / 100);
    }

    @Override
    public String getTipo() {
        return "Desconto Percentual: " + percentual + "%";
    }
}
