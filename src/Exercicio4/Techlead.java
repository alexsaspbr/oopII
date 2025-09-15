package Exercicio4;

class Techlead implements Trabalhador, Estudante, Programador, Professor {
    private String nome;

    public Techlead(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está liderando a equipe técnica");
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando arquiteturas avançadas");
    }

    @Override
    public void programar() {
        System.out.println(nome + " está fazendo code review e prototipando");
    }

    @Override
    public void ensinar() {
        System.out.println(nome + " está mentorando desenvolvedores junior");
    }

    @Override
    public String toString() {
        return "Techlead: " + nome;
    }
}
