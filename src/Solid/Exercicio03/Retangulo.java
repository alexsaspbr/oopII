package Solid.Exercicio03;

public class Retangulo {
    protected double largura;
    protected double altura;
    
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getArea() {
        return largura * altura;
    }
}
