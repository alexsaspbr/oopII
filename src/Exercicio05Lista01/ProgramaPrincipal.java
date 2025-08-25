package Exercicio05Lista01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> canaisEscolhidos = new ArrayList<>();

        System.out.println("Bem-vindo ao Sistema de Notificações!");
        System.out.println("Escolha os canais que deseja ativar (digite o número e pressione Enter).");
        System.out.println("Digite '0' quando terminar.");

        int escolha = -1;
        while (escolha != 0) {
            System.out.println("\nCanais disponíveis:");
            System.out.println("1. E-mail");
            System.out.println("2. SMS");
            System.out.println("3. Notificação Push");
            System.out.println("0. Concluir seleção e enviar mensagem");
            System.out.print("Sua escolha: ");

            try {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        canaisEscolhidos.add(new EmailNotificacao());
                        System.out.println(">> Canal de E-mail adicionado!");
                        break;
                    case 2:
                        canaisEscolhidos.add(new SmsNotificacao());
                        System.out.println(">> Canal de SMS adicionado!");
                        break;
                    case 3:
                        canaisEscolhidos.add(new PushNotificacao());
                        System.out.println(">> Canal de Notificação Push adicionado!");
                        break;
                    case 0:
                        System.out.println("Seleção de canais concluída.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa o buffer do scanner
            }
        }

        if (canaisEscolhidos.isEmpty()) {
            System.out.println("Nenhum canal foi selecionado. O programa será encerrado.");
        } else {
            // Consumir a quebra de linha pendente do nextInt()
            scanner.nextLine();

            System.out.print("\nDigite a mensagem que deseja enviar: ");
            String mensagem = scanner.nextLine();

            // 1. Injetando a dependência (canaisEscolhidos) no construtor
            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisEscolhidos);

            // 2. Usando o gerenciador para notificar todos os canais de uma vez
            gerenciador.notificarTodos(mensagem);

            System.out.println("Processo finalizado.");
        }

        scanner.close();
    }
}