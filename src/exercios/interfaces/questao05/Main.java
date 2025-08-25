package exercios.interfaces.questao05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notification> canais = new ArrayList<>();

        System.out.println("Escolha os canais de notificação (separados por vírgula):");
        System.out.println("1 - Email\n2 - SMS\n3 - Push");
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

        if (canais.isEmpty()) {
            System.out.println("Nenhum canal selecionado. Encerrando.");
            return;
        }

        System.out.print("Digite a mensagem a ser enviada: ");
        String mensagem = scanner.nextLine();

        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canais);
        gerenciador.notificarTodos(mensagem);
    }
}

