package exercios.interfaces.questao01;

//### **1. Criando uma Interface Simples**
//Crie uma interface `Animal` com os métodos `emitirSom()` e `mover()`.
//Depois, implemente-a nas classes `Cachorro` e `Gato`.
//No programa principal, crie objetos das duas classes e invoque seus métodos.

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom(); // Saída: AU
        cachorro.mover();     // Saída: Movendo

        gato.emitirSom();     // Saída: MIAU
        gato.mover();         // Saída: Movendo
    }
}
