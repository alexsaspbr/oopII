package exercicio1;

public class MainExercicio1 {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        cachorro.mover();

        gato.emitirSom();
        gato.mover();
    }
}
