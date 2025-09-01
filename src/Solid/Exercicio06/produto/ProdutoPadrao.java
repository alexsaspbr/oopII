package Solid.Exercicio06.produto;

// LSP: Implementação concreta de Produto que pode ser substituída por qualquer outra implementação
public class ProdutoPadrao implements Produto {
    private String nome;
    private double preco;
    
    public ProdutoPadrao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
