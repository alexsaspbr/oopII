package Solid.Exercicio02;

public class Loja {
    private String nome;
    
    public Loja(String nome) {
        this.nome = nome;
    }
    
    public double calcularPrecoComDesconto(double precoOriginal, Desconto desconto) {
        return desconto.aplicarDesconto(precoOriginal);
    }
    
    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Minha Loja");
        
        // Exemplo de uso com desconto fixo
        Desconto descontoFixo = new DescontoFixo(10.0);
        double precoComDescontoFixo = minhaLoja.calcularPrecoComDesconto(100.0, descontoFixo);
        System.out.println("Preço com desconto fixo: R$" + precoComDescontoFixo);
        
        // Exemplo de uso com desconto percentual
        Desconto descontoPorcentagem = new DescontoPorcentagem(15.0); // 15% de desconto
        double precoComDescontoPorcentagem = minhaLoja.calcularPrecoComDesconto(100.0, descontoPorcentagem);
        System.out.println("Preço com 15% de desconto: R$" + precoComDescontoPorcentagem);
    }
}
