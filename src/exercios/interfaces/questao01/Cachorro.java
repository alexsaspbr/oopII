package exercios.interfaces.questao01;

class Cachorro implements Animal{
    @Override
    public void emitirSom(){
        System.out.println("AU");
    }

    @Override
    public void mover(){
        System.out.println("Movendo");
    }
}