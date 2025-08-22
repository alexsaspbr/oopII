package Exercicio04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das implementações
        Armazenamento bd = new BancoDeDados();
        Armazenamento arquivo = new ArquivoTexto();

        // Criando uma lista de Armazenamento para demonstrar polimorfismo
        List<Armazenamento> sistemasDeArmazenamento = new ArrayList<>();
        sistemasDeArmazenamento.add(bd);
        sistemasDeArmazenamento.add(arquivo);

        String dadoParaSalvar = "Dados importantes para o sistema!";

        System.out.println("--- Demonstração de Polimorfismo com Interfaces ---");

        // Iterando sobre a lista e chamando os mesmos métodos para objetos diferentes.
        // O polimorfismo garante que a implementação correta de 'salvar' e 'ler'
        // seja chamada para cada objeto.
        for (Armazenamento sistema : sistemasDeArmazenamento) {
            System.out.println("\nProcessando com: " + sistema.getClass().getSimpleName());
            sistema.salvar(dadoParaSalvar);
            String dadoLido = sistema.ler();
            System.out.println("-> Dado lido: '" + dadoLido + "'");
        }

        System.out.println("\n--- Fim da Demonstração ---");
    }
}
