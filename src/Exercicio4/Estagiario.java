package Exercicio4;

class Estagiario implements Trabalhador, Estudante {
    private String nome;

    public Estagiario(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está fazendo tarefas de estágio");
    }

    public void estudar() {
        System.out.println(nome + " está estudando para aprender");
    }

    @Override
    public String toString() {
        return "Estagiario: " + nome;
    }
}
