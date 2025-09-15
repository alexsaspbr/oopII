package Exercicio4;

class Desenvolvedor implements Trabalhador, Estudante, Programador{
    private String nome;

    public Desenvolvedor(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando no desenvolvimento");
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando novas tecnologias");
    }

    @Override
    public void programar() {
        System.out.println(nome + " está programando");
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome;
    }
}
