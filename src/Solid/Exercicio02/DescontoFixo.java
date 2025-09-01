package Solid.Exercicio02;

public class DescontoFixo implements Desconto {
    private double valorFixo;
    
    public DescontoFixo(double valorFixo) {
        this.valorFixo = valorFixo;
    }
    
    @Override
    public double aplicarDesconto(double valor) {
        return valor - valorFixo;
    }
}
