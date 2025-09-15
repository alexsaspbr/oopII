package Exercicio3;

class RetanguloLSP implements Forma {
    private double largura;
    private double altura;

    public RetanguloLSP(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Dimensões devem ser positivas.");
        }

        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser positiva.");
        }
        this.largura = largura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
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

    @Override
    public String toString() {
        return String.format("%s, Área: %.1f", getDescricao(), area());
    }
}
