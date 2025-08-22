# Exercício 4: Polimorfismo com Interfaces em Java

Este diretório contém a resolução do quarto exercício da lista, focado em demonstrar o uso de polimorfismo com interfaces em Java.

## 🎯 Objetivo

O objetivo deste exercício é implementar um sistema de gerenciamento de arquivos simplificado, utilizando uma interface `Armazenamento` para abstrair a forma como os dados são salvos e lidos. Duas implementações concretas (`BancoDeDados` e `ArquivoTexto`) são criadas para simular diferentes meios de armazenamento.

O programa principal demonstra o polimorfismo ao tratar objetos de diferentes classes (`BancoDeDados` e `ArquivoTexto`) de maneira uniforme, através da referência da interface `Armazenamento`.

## 📂 Estrutura de Arquivos

O projeto está organizado da seguinte forma:

- **`Armazenamento.java`**: A interface que define o contrato com os métodos `salvar(String dado)` e `ler()`.
- **`BancoDeDados.java`**: Uma classe que implementa a interface `Armazenamento`, simulando a persistência de dados em um banco de dados.
- **`ArquivoTexto.java`**: Uma classe que também implementa `Armazenamento`, simulando a gravação e leitura de dados em um arquivo de texto.
- **`Main.java`**: A classe principal que contém o método `main`. Ela cria uma lista de objetos do tipo `Armazenamento` e utiliza o polimorfismo para invocar os métodos `salvar()` e `ler()` de cada objeto, independentemente de sua classe concreta.

