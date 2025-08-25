package exercicio4;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuOperacoes(BancoDeDados banco, ArquivoTexto arquivo) {
        int opcao;
        do {
            System.out.println("\n===== Sistema de Armazenamento =====");
            System.out.println("1 - Salvar no Banco de Dados");
            System.out.println("2 - Ler do Banco de Dados");
            System.out.println("3 - Salvar no Arquivo de Texto");
            System.out.println("4 - Ler do Arquivo de Texto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o dado para salvar no Banco: ");
                    String dado = scanner.nextLine();
                    banco.salvar(dado);
                }
                case 2 -> banco.ler();
                case 3 -> {
                    System.out.print("Digite o dado para salvar no Arquivo: ");
                    String dado = scanner.nextLine();
                    arquivo.salvar(dado);
                }
                case 4 -> arquivo.ler();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
