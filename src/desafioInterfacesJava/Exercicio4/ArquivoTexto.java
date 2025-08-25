package desafioInterfacesJava.Exercicio4;
import java.util.ArrayList;
import java.util.List;


public class ArquivoTexto implements Armazenamento {
    private List<String> dados = new ArrayList<>();

    @Override
    public void salvar(String dado) {
        dados.add(dado);
        System.out.println("Dado salvo no arquivo de texto: " + dado);
    }

    @Override
    public String ler() {
        return "Conteúdo do arquivo de texto: " + String.join(", ", dados);
    }
}
