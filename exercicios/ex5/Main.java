package exercicios.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> notificadores = new ArrayList<>();
        
        System.out.println("=== SISTEMA DE NOTIFICAÇÕES ===");
        System.out.println();
        
        configurarCanaisNotificacao(scanner, notificadores);
        
        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(notificadores);
        
        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Enviar notificação");
            System.out.println("2. Adicionar novo canal");
            System.out.println("3. Remover canal");
            System.out.println("4. Listar canais ativos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    enviarNotificacao(scanner, gerenciador);
                    break;
                case 2:
                    adicionarNovoCanal(scanner, gerenciador);
                    break;
                case 3:
                    removerCanal(scanner, gerenciador);
                    break;
                case 4:
                    listarCanaisAtivos(gerenciador);
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    
    private static void configurarCanaisNotificacao(Scanner scanner, List<Notificacao> notificadores) {
        System.out.println("=== CONFIGURAÇÃO INICIAL DOS CANAIS ===");
        
        System.out.print("Deseja configurar notificação por email? (s/n): ");
        if (scanner.nextLine().toLowerCase().startsWith("s")) {
            System.out.print("Digite o endereço de email: ");
            String email = scanner.nextLine();
            notificadores.add(new EmailNotificacao(email));
            System.out.println("Email configurado com sucesso!");
        }
        
        System.out.print("Deseja configurar notificação por SMS? (s/n): ");
        if (scanner.nextLine().toLowerCase().startsWith("s")) {
            System.out.print("Digite o número de telefone: ");
            String telefone = scanner.nextLine();
            notificadores.add(new SmsNotificacao(telefone));
            System.out.println("SMS configurado com sucesso!");
        }
        
        System.out.print("Deseja configurar notificação push? (s/n): ");
        if (scanner.nextLine().toLowerCase().startsWith("s")) {
            System.out.print("Digite o token do dispositivo: ");
            String token = scanner.nextLine();
            notificadores.add(new PushNotificacao(token));
            System.out.println("Push notification configurado com sucesso!");
        }
        
        if (notificadores.isEmpty()) {
            System.out.println("Nenhum canal configurado. Adicionando canais padrão...");
            notificadores.add(new EmailNotificacao("usuario@exemplo.com"));
            notificadores.add(new SmsNotificacao("+55 11 99999-9999"));
            notificadores.add(new PushNotificacao("token-padrao-123"));
        }
        
        System.out.println("Total de canais configurados: " + notificadores.size());
    }
    
    private static void enviarNotificacao(Scanner scanner, GerenciadorDeNotificacoes gerenciador) {
        System.out.print("Digite a mensagem a ser enviada: ");
        String mensagem = scanner.nextLine();
        
        if (mensagem.trim().isEmpty()) {
            System.out.println("Mensagem não pode estar vazia!");
            return;
        }
        
        gerenciador.notificarTodos(mensagem);
    }
    
    private static void adicionarNovoCanal(Scanner scanner, GerenciadorDeNotificacoes gerenciador) {
        System.out.println("\n=== ADICIONAR NOVO CANAL ===");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push Notification");
        System.out.print("Escolha o tipo de canal: ");
        
        int tipo = scanner.nextInt();
        scanner.nextLine();
        
        switch (tipo) {
            case 1:
                System.out.print("Digite o endereço de email: ");
                String email = scanner.nextLine();
                gerenciador.adicionarNotificador(new EmailNotificacao(email));
                System.out.println("Canal de email adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Digite o número de telefone: ");
                String telefone = scanner.nextLine();
                gerenciador.adicionarNotificador(new SmsNotificacao(telefone));
                System.out.println("Canal de SMS adicionado com sucesso!");
                break;
            case 3:
                System.out.print("Digite o token do dispositivo: ");
                String token = scanner.nextLine();
                gerenciador.adicionarNotificador(new PushNotificacao(token));
                System.out.println("Canal de push notification adicionado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void removerCanal(Scanner scanner, GerenciadorDeNotificacoes gerenciador) {
        List<Notificacao> notificadores = gerenciador.getNotificadores();
        
        if (notificadores.isEmpty()) {
            System.out.println("Não há canais para remover!");
            return;
        }
        
        System.out.println("\n=== REMOVER CANAL ===");
        for (int i = 0; i < notificadores.size(); i++) {
            Notificacao notificador = notificadores.get(i);
            String tipo = notificador.getClass().getSimpleName();
            System.out.println((i + 1) + ". " + tipo);
        }
        
        System.out.print("Escolha o canal a ser removido: ");
        int indice = scanner.nextInt();
        
        if (indice >= 1 && indice <= notificadores.size()) {
            Notificacao notificadorRemovido = notificadores.get(indice - 1);
            gerenciador.removerNotificador(notificadorRemovido);
            System.out.println("Canal removido com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }
    
    private static void listarCanaisAtivos(GerenciadorDeNotificacoes gerenciador) {
        List<Notificacao> notificadores = gerenciador.getNotificadores();
        
        System.out.println("\n=== CANAIS ATIVOS ===");
        if (notificadores.isEmpty()) {
            System.out.println("Nenhum canal configurado.");
            return;
        }
        
        for (int i = 0; i < notificadores.size(); i++) {
            Notificacao notificador = notificadores.get(i);
            String tipo = notificador.getClass().getSimpleName();
            System.out.println((i + 1) + ". " + tipo);
        }
        
        System.out.println("Total: " + notificadores.size() + " canal(is)");
    }
}
