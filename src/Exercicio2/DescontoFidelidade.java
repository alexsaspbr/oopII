package Exercicio2;

class DescontoFidelidade implements CalculadorDesconto{
    private final int pontosCliente;

    public DescontoFidelidade(int pontosCliente) {
        this.pontosCliente = pontosCliente;
    }

    @Override
    public double calcular(double valor) {
        double descontoPontos = pontosCliente * 0.10;
        return Math.min(descontoPontos, valor * 0.25);
    }

    @Override
    public String getTipo() {
        return "Desconto Fidelidade: " + pontosCliente + "pontos";
    }

}
