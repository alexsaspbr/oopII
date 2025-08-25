package exercicios.questao08;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "', preco=" + preco + "}";
    }
}
