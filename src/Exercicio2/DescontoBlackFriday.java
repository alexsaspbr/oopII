package Exercicio2;

public class DescontoBlackFriday implements CalculadorDesconto{
    @Override
    public double calcular(double valor) {
        return valor * 0.30;
    }

    @Override
    public String getTipo() {
        return "Desconto Black Friday: 30%";
    }
}
