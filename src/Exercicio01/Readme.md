# Exercício 1: Criando uma Interface Simples

Este exercício demonstra um dos conceitos fundamentais da programação orientada a objetos em Java: o uso de **interfaces**. O objetivo é criar um contrato comum para um grupo de classes relacionadas.

A tarefa era criar uma interface `Animal` com dois métodos:
- `emitirSom()`: Para representar o som que o animal faz.
- `mover()`: Para representar o movimento do animal.

Em seguida, implementar essa interface em duas classes distintas: `Cachorro` e `Gato`, cada uma fornecendo sua própria lógica para os métodos definidos na interface. Por fim, criar uma classe `Main` para instanciar objetos dessas classes e invocar seus métodos.

## Estrutura da Solução

O código foi organizado da seguinte forma:

### 1. `Animal.java` (A Interface)
Esta é a planta do nosso "animal". Ela não contém implementação, apenas define quais métodos uma classe deve ter para ser considerada um `Animal`.

### 2. `Cachorro.java ` e `Gato.java` (As Implementações)
Estas Classes "assinam o contarto" da interface `Animal` e fornecem implementações concretas para os modelos `emitirSom()` e `mover()`.

### 3. `Main.java` (A Classe Principal)
Esta classe contém o método `main`, que é o ponto de entrada do programa. Aqui, criamos instâncias de e e demonstramos o polimorfismo, tratando ambos os objetos como do tipo . `Cachorro``Gato``Animal`

