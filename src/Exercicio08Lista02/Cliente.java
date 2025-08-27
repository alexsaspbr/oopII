package Exercicio08Lista02;

public class Cliente implements Identificavel {
    private final int id;
    private final String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override public int getId() { return id; }
    public String getNome() { return nome; }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
