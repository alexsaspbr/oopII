package exercicio2;

import java.util.Scanner;

public class MainExercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        Menu menu = new Menu(scanner);
        menu.exibirMenuOperacoes(calculadora);
    }
}
