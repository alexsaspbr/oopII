package Exercicio3;

abstract class FormaImutavel {
    public abstract double area();
    public abstract double perimetro();
    public abstract String getDescricao();

    @Override
    public String toString() {
        return String.format("%s, Área: %.1f", getDescricao(), area());
    }
}
