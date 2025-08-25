package desafioInterfacesJava.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados implements Armazenamento {
    private List<String> dados = new ArrayList<>();

    @Override
    public void salvar(String dado) {
        dados.add(dado);
        System.out.println("Dado salvo no banco de dados: " + dado);
    }

    @Override
    public String ler() {
        return "Dados do banco de dados: " + String.join(", ", dados);
    }
}
