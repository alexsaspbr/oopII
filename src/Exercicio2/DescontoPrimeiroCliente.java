package Exercicio2;

class DescontoPrimeiroCliente implements CalculadorDesconto{
    @Override
    public double calcular(double valor) {
        return Math.min(valor * 0.20, 50.0);
    }

    @Override
    public String getTipo() {
        return "Desconto Primeiro Cliente: 20% (max: R$ 50)";
    }
}
