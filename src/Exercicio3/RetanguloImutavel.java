package Exercicio3;

public class RetanguloImutavel extends FormaImutavel {
    private final double largura;
    private final double altura;

    public RetanguloImutavel(double largura, double altura) {

        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Dimensões devem ser positivas.");
        }
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public RetanguloImutavel comLargura(double novaLargura) {
        return new RetanguloImutavel(novaLargura, this.altura);
    }

    public RetanguloImutavel comAltura(double novaAltura) {
        return new RetanguloImutavel(this.largura, novaAltura);
    }

    @Override
    public double area() {
        return largura * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String getDescricao() {
        return String.format("Retângulo: %.1fx%.1f", largura, altura);
    }
}
