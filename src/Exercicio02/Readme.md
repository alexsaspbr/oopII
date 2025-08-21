# Exercício 2: Calculadora com Interface
Este projeto é uma solução para o segundo exercício da lista de desafios de Interfaces em Java. O objetivo é criar uma calculadora que utiliza uma interface para definir suas operações matemáticas e constantes.

## 📜 Descrição do Exercício
O enunciado pedia para:
1. Criar uma interface que defina constantes para `PI` e `E`. `OperacoesMatematicas`
2. A interface deveria declarar os métodos , , e . `somar``subtrair``multiplicar``dividir`
3. Implementar essa interface em uma classe . `Calculadora`
4. Permitir que o usuário insira os valores para os cálculos.
5. Exibir os valores das constantes `PI` e `E` com 8 casas decimais.

### 📂 Estrutura do Projeto
O projeto é composto por três arquivos Java:
1. **`OperacoesMatematicas.java`**
    - É a `interface` que define o contrato da calculadora.
    - Contém as constantes `PI` e `E` com precisão dupla (`double`).
    - Declara as assinaturas dos métodos para as quatro operações básicas.

2. **`Calculadora.java`**
    - É a classe concreta que `implements OperacoesMatematicas`.
    - Fornece a lógica para os métodos de somar, subtrair, multiplicar e dividir.
    - Inclui um tratamento para evitar a divisão por zero.

3. **`Main.java`**
    - É a classe principal que contém o método `main`, o ponto de entrada do programa.
    - Utiliza a classe `Scanner` para receber dois números do usuário.
    - Cria uma instância da e invoca seus métodos com os números fornecidos pelo usuário. `Calculadora`
    - Exibe os resultados das operações e os valores das constantes `PI` e `E` formatados para 8 casas decimais usando `System.out.printf()`.
