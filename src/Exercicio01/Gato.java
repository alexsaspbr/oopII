package Exercicio01;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    @Override
    public void mover() {
        System.out.println("Gato se movendo.");
    }
}
