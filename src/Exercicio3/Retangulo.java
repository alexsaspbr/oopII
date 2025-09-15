package Exercicio3;

public class Retangulo {
    protected double largura;
    protected double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area() {
        return largura * altura;
    }

    @Override
    public String toString() {
        return String.format("Retângulo: %.1f x %.1f, Área: %.1f",
                largura, altura, area());
    }
}
