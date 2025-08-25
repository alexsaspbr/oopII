package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuOperacoes() {
        List<Notificacao> notificadores;

        int opcao;
        do {
            System.out.println("\n===== Sistema de Notificações =====");
            System.out.println("1 - Email");
            System.out.println("2 - Sms");
            System.out.println("3 - Push");
            System.out.println("4 - Todos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            notificadores = new ArrayList<>();
            switch (opcao) {
                case 1 -> notificadores.add(new EmailNotificacao());
                case 2 -> notificadores.add(new SmsNotificacao());
                case 3 -> notificadores.add(new PushNotificacao());
                case 4 -> {
                    notificadores.add(new EmailNotificacao());
                    notificadores.add(new SmsNotificacao());
                    notificadores.add(new PushNotificacao());
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            if (!notificadores.isEmpty()) {
                System.out.print("Digite a mensagem para enviar: ");
                String mensagem = scanner.nextLine();
                GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(notificadores);
                gerenciador.notificarTodos(mensagem);
            }
        } while (opcao != 0);

        scanner.close();
    }
}
