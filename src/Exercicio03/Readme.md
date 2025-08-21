# Exercício 3: Interfaces com Métodos `default` e `static`

Este projeto contém a resolução do terceiro exercício da lista, focado em demonstrar o uso de métodos `default` e `static` em interfaces Java, um recurso introduzido a partir do Java 8.

## 🎯 Objetivo

O objetivo é criar uma interface `Pagamento` que, além de definir um contrato para classes de pagamento, também forneça implementações padrão (com `default`) e funcionalidades utilitárias (com `static`).

## 📂 Estrutura do Projeto

O projeto é composto pelos seguintes arquivos:

- **`Pagamento.java`**: A interface que define o contrato para formas de pagamento.
    - `processarPagamento(double valor)`: Método abstrato que deve ser implementado por cada classe de pagamento.
    - `gerarRecibo(double valor)`: Método `default` que fornece uma implementação padrão para gerar um recibo, podendo ser reutilizado ou sobrescrito.
    - `validarValor(double valor)`: Método `static` que pertence à interface e serve como uma função utilitária para validar se um valor de pagamento é positivo.

- **`CartaoCredito.java`**: Uma implementação da interface `Pagamento` que simula o processamento de uma compra com cartão de crédito.

- **`Pix.java`**: Outra implementação da interface `Pagamento`, simulando uma transação via Pix.

- **`Main.java`**: A classe principal que contém o método `main` para instanciar e testar as classes de pagamento, demonstrando o funcionamento dos métodos `default` e `static`.
