package Desafio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> canais = new ArrayList<>();

        System.out.println("Escolha os canais de notificação:");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");
        System.out.println("Digite os números separados por vírgula (ex: 1,2):");
        String[] escolhas = scanner.nextLine().split(",");

        for (String escolha : escolhas) {
            switch (escolha.trim()) {
                case "1":
                    canais.add(new EmailNotificacao());
                    break;
                case "2":
                    canais.add(new SmsNotificacao());
                    break;
                case "3":
                    canais.add(new PushNotificacao());
                    break;
                default:
                    System.out.println("Opção inválida: " + escolha);
            }
        }

        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canais);

        System.out.println("Digite a mensagem:");
        String mensagem = scanner.nextLine();

        gerenciador.notificarTodos(mensagem);
    }
}
