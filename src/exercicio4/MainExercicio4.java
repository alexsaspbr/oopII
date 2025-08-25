package exercicio4;

import java.util.Scanner;

public class MainExercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BancoDeDados banco = new BancoDeDados();
        ArquivoTexto arquivo = new ArquivoTexto();

        Menu menu = new Menu(scanner);
        menu.exibirMenuOperacoes(banco, arquivo);
    }
}
