# Lista de Exercícios - Princípios SOLID em Java

## Exercício 1 - SRP (Single Responsibility Principle)
Implemente uma classe `Relatorio` que atualmente gera relatórios e também envia emails. Reestruture essa classe aplicando o princípio da responsabilidade única.

---

## Exercício 2 - OCP (Open/Closed Principle)
Implemente um sistema de cálculo de desconto para uma loja, inicialmente com desconto fixo. Em seguida, adapte o sistema para que possa receber novos tipos de desconto sem modificar a lógica já existente.

---

## Exercício 3 - LSP (Liskov Substitution Principle)
Implemente uma classe `Quadrado` que herda de `Retangulo`. Mostre problemas que podem surgir e reestruture o código para estar em conformidade com o LSP.

---

## Exercício 4 - ISP (Interface Segregation Principle)
Implemente uma interface `Trabalhador` com métodos `trabalhar()` e `estudar()`. Mostre como aplicar o ISP criando interfaces mais coesas.

---

## Exercício 5 - DIP (Dependency Inversion Principle)
Implemente um sistema de notificação que envia mensagens via `EmailService`. Refatore o código para que a classe `Notificador` dependa de abstrações e não de implementações concretas.

---

## Exercício 6 - Desafio Final
Implemente um sistema de **Gerenciamento de Pedidos de uma Loja Online**, aplicando todos os princípios do SOLID:

- SRP: separar responsabilidades de classes de pedido, pagamento e envio.
- OCP: permitir a adição de novos métodos de pagamento sem alterar código existente.
- LSP: garantir que substituições de classes funcionem sem quebrar o sistema.
- ISP: dividir interfaces em contratos menores e específicos.
- DIP: depender de abstrações em vez de implementações concretas.