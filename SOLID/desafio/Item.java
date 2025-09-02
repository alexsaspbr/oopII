package desafio;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;
    private double peso;

    public Item(String nome, double preco, int quantidade, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPeso() {
        return peso;
    }
}