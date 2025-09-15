package Exercicio3;

class QuadradoLSP implements Forma{
    private double lado;

    public QuadradoLSP(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser positivo.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {

        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser positivo.");
        }
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String getDescricao() {
        return String.format("Quadrado: %.1fx%.1f", lado, lado);
    }

    @Override
    public String toString() {
        return String.format("%s, Área: %.1f", getDescricao(), area());
    }
}
