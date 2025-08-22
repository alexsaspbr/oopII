package Exercicio04;

/**
 * Simula o armazenamento de dados em um arquivo de texto.
 */
public class ArquivoTexto implements Armazenamento {
    private String conteudo = "";

    @Override
    public void salvar(String dado) {
        System.out.println("Gravando em arquivo de texto: '" + dado + "'");
        this.conteudo = dado;
    }

    @Override
    public String ler() {
        System.out.println("Lendo dados do arquivo de texto.");
        return this.conteudo;
    }
}
