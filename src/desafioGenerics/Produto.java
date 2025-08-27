package desafioGenerics;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return String.format("Produto[id=%d, nome='%s', preco=R$%.2f]",
                id, nome, preco);
    }
}