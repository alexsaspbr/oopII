package exercicio2;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void exibirMenuOperacoes(Calculadora calculadora) {
        int opcao;
        do {
            System.out.println("\n===== Calculadora =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Mostrar constantes PI e E");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    double[] valores = lerNumeros(scanner);
                    System.out.println("Resultado da soma: " + calculadora.somar(valores[0], valores[1]));
                }
                case 2 -> {
                    double[] valores = lerNumeros(scanner);
                    System.out.println("Resultado da subtraçao: " + calculadora.subtrair(valores[0], valores[1]));
                }
                case 3 -> {
                    double[] valores = lerNumeros(scanner);
                    System.out.println("Resultado da multiplicaçao: " + calculadora.multiplicar(valores[0], valores[1]));
                }
                case 4 -> {
                    double[] valores = lerNumeros(scanner);
                    try {
                        System.out.println("Resultado da divisao: " + calculadora.dividir(valores[0], valores[1]));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Constante PI: " + OperacoesMatematicas.PI);
                    System.out.println("Constante E: " + OperacoesMatematicas.E);
                }
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static double[] lerNumeros(Scanner scanner) {
        double[] numeros = new double[2];

        System.out.print("Digite o primeiro número: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numeros[1] = scanner.nextDouble();

        return numeros;
    }
}
