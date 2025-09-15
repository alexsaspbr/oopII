package Exercicio3;

class QuadradoImutavel extends FormaImutavel {
    private final double lado;

    public QuadradoImutavel(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser positivo.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public QuadradoImutavel comLado(double novoLado) {
        return new QuadradoImutavel(novoLado);
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
}
