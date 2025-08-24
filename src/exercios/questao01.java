package exercios;

public interface Animal {

    void emitirSom();
    void mover();
}

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