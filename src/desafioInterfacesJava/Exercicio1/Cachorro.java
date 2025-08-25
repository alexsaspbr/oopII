package desafioInterfacesJava.Exercicio1;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo...!");
    }

    @Override
    public void mover() {
        System.out.println("O Cachorro está se movendo...");
    }
}
