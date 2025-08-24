package Exercicio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> canaisEscolhidos = new ArrayList<>();

        System.out.println("Escolha os canais de notificação (digite os números separados por espaço):");
        System.out.println("1: E-mail");
        System.out.println("2: SMS");
        System.out.println("3: Push");

        String[] escolhas = scanner.nextLine().split(" ");
        for (String escolha : escolhas) {
            switch (escolha) {
                case "1":
                    canaisEscolhidos.add(new EmailNotificacao());
                    break;
                case "2":
                    canaisEscolhidos.add(new SmsNotificacao());
                    break;
                case "3":
                    canaisEscolhidos.add(new PushNotificacao());
                    break;
            }
        }

        if (canaisEscolhidos.isEmpty()) {
            System.out.println("Nenhum canal de notificação foi selecionado.");
        } else {
            GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisEscolhidos);
            System.out.println("Digite a mensagem a ser enviada:");
            String mensagem = scanner.nextLine();
            gerenciador.notificarTodos(mensagem);
        }

        scanner.close();
    }
}