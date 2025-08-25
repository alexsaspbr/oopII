package exercicio5;

import java.util.Scanner;

public class MainExercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu(scanner);
        menu.exibirMenuOperacoes();
    }
}
