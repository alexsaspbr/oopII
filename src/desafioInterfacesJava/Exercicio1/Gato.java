package desafioInterfacesJava.Exercicio1;

public class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato está miando...");
    }

    @Override
    public void mover() {
        System.out.println("O Gato está se movendo");
    }

}
