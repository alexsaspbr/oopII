package Exercicio2;

public class DescontoProgressivo implements CalculadorDesconto{
    @Override
    public double calcular(double valor) {
        if (valor > 500) return valor * 0.15;
        else if (valor > 200) return valor * 0.10;
        else return valor * 0.05;
    }

    @Override
    public String getTipo() {
        return "Desconto Progressivo (5%, 10%, 15%)";
    }
}
