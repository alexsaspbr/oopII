# Exercício 05: Sistema de Notificações

Este projeto implementa um sistema de notificações flexível e extensível em Java, utilizando interfaces para desacoplar os componentes do sistema.

## Visão Geral

O objetivo é desenvolver um sistema que possa enviar notificações através de múltiplos canais, como E-mail, SMS e Push. O design do sistema utiliza o princípio de Inversão de Controle e Injeção de Dependência, permitindo que novos canais de notificação sejam adicionados no futuro com o mínimo de alteração no código existente.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

-   **`Notificacao.java`**: É a interface que define o contrato para todos os tipos de notificação. Ela possui um único método, `enviar(String mensagem)`, que deve ser implementado por todas as classes que representam um canal de notificação.

-   **Classes de Notificação**:
    -   `EmailNotificacao.java`: Implementação da interface `Notificacao` para o envio de e-mails.
    -   `SmsNotificacao.java`: Implementação para o envio de mensagens SMS.
    -   `PushNotificacao.java`: Implementação para o envio de notificações Push para dispositivos móveis.

-   **`GerenciadorDeNotificacoes.java`**: Esta classe é responsável por gerenciar e enviar as notificações. Ela recebe uma lista de notificadores (objetos que implementam a interface `Notificacao`) através de seu construtor, caracterizando a injeção de dependência. O método `notificarTodos(String mensagem)` percorre a lista e aciona o método `enviar()` de cada notificador.

-   **`Main.java`**: É o ponto de entrada da aplicação. Nela, o usuário pode escolher interativamente quais canais de notificação deseja utilizar. Com base na escolha, os objetos correspondentes são instanciados e passados para o `GerenciadorDeNotificacoes`.

## Extensibilidade

O design do sistema permite a fácil adição de novos canais de notificação. Para adicionar um novo canal (por exemplo, `WhatsAppNotificacao`), você precisaria apenas:

1.  Criar uma nova classe `WhatsAppNotificacao` que implemente a interface `Notificacao`.
2.  Implementar o método `enviar(String mensagem)` com a lógica específica do novo canal.
3.  Atualizar a classe `Main` para incluir a nova opção de escolha para o usuário.

Nenhuma alteração seria necessária no `GerenciadorDeNotificacoes` ou nas classes de notificação existentes, o que demonstra a flexibilidade e a manutenibilidade da solução.
