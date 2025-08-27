package desafioGenerics;

public class Cliente {
    private int id;
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("Cliente[id=%d, nome='%s', email='%s']",
                id, nome, email);
    }
}