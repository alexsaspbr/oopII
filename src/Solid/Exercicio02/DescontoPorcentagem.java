package Solid.Exercicio02;

public class DescontoPorcentagem implements Desconto {
    private double porcentagem;
    
    public DescontoPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem / 100.0;
    }
    
    @Override
    public double aplicarDesconto(double valor) {
        return valor * (1 - porcentagem);
    }
}
