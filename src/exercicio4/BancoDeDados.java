package exercicio4;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados implements Armazenamento {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void salvar(String dado) {
        registros.add(dado);
        System.out.println("Salvo no Banco de Dados: " + dado);
    }

    @Override
    public void ler() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado no Banco de Dados.");
        } else {
            System.out.println("Registros no Banco de Dados:");
            for (String registro : registros) {
                System.out.println("- " + registro);
            }
        }
    }
}
