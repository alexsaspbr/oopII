package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora minhaCalculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora ---");

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro valor: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double num2 = scanner.nextDouble();

        // Realiza e exibe os cálculos
        System.out.println("\n--- Resultados ---");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + minhaCalculadora.somar(num1, num2));
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + minhaCalculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + minhaCalculadora.multiplicar(num1, num2));

        double resultadoDivisao = minhaCalculadora.dividir(num1, num2);
        // A mensagem de erro de divisão por zero já é tratada na classe Calculadora
        if (!Double.isNaN(resultadoDivisao)) {
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + resultadoDivisao);
        }

        // Acessando as constantes da interface
        System.out.println("\n--- Constantes da Interface ---");
        System.out.println("Valor de PI: " + OperacoesMatematicas.PI);
        System.out.println("Valor de E: " + OperacoesMatematicas.E);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}