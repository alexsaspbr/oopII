package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> canaisSelecionados = new ArrayList<>();

        System.out.println("Bem vindo");
        System.out.println("Escolha os canais de notificacão que deseja ativar (digite 'fim' para concluir):");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");

        String escolha;
        while (true) {
            System.out.print("Digite o número do canal ou 'fim': ");
            escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("fim")) {
                break;
            }

            switch (escolha) {
                case "1":
                    canaisSelecionados.add(new EmailNotificacao());
                    System.out.println("Canal 'E-mail' adicionado.");
                    break;
                case "2":
                    canaisSelecionados.add(new SmsNotificacao());
                    System.out.println("Canal 'SMS' adicionado.");
                    break;
                case "3":
                    canaisSelecionados.add(new PushNotificacao());
                    System.out.println("Canal 'Push' adicionado.");
                    break;
                default:
                    System.out.println("Opção invalida Tente novamente.");
            }
        }

        if (canaisSelecionados.isEmpty()) {
            System.out.println("Nenhum canal foi selecionado. Encerrando o program");
        } else {

            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisSelecionados);

            System.out.print("\nDigite a mensagem que deseja enviar: ");

            String mensagem = scanner.nextLine();

            gerenciador.notificarTodos(mensagem);
        }

        scanner.close();
    }
    }

