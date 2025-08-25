package exercios.interfaces.questao01;

class Gato implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("MIAU");
    }

    @Override
    public void mover(){
        System.out.println("Movendo");
    }
}