package Exercicio01;

public class Cachorro implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void mover() {
        System.out.println("Cachorro se movendo.");
    }
}
