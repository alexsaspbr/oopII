package Exercicio3;

class QuadradoProblematico extends Retangulo {
    public QuadradoProblematico(double lado) {
        super(lado, lado);
    }

    @Override
    public void setLargura(double largura) {
        this.largura = altura;
        this.altura = largura;
    }

    @Override
    public void setAltura(double altura) {
        this.largura = altura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Quadrado: %.1fx%.1f, Área: %.1f",
                             largura,altura,area());
    }
}
