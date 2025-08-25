package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class ArquivoTexto implements Armazenamento {

    private final List<String> entradas = new ArrayList<>();

    @Override
    public void salvar(String dado) {
        entradas.add(dado);
        System.out.println("Gravando no arquivo de texto: " + dado);
    }

    @Override
    public void ler() {
        if (entradas.isEmpty()) {
            System.out.println("Arquivo de texto está vazio.");
        } else {
            System.out.println("Entradas do Arquivo de Texto:");
            for (String entrada : entradas) {
                System.out.println("- " + entrada);
            }
        }
    }
}
