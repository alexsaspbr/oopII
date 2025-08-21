package Exercicio01;

public class Main {
    public static void main(String[] args) {
        Animal Cachorro = new Cachorro();
        Animal Gato = new Gato();

        System.out.println("Cachorro:");
        Cachorro.emitirSom();
        Cachorro.mover();

        System.out.println("\nGato:");
        Gato.emitirSom();
        Gato.mover();
    }
}
