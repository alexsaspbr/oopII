package Exercicio4;

class Operario implements Trabalhador{
    private String nome;

    public Operario(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando na linha de produção");
    }

    @Override
    public String toString() {
        return "Operario: " + nome;
    }
}
