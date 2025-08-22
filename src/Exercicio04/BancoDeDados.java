package Exercicio04;

/**
 * Simula o armazenamento de dados em um Banco de Dados.
 */
public class BancoDeDados implements Armazenamento {
    private String dadosArmazenados = "";

    @Override
    public void salvar(String dado) {
        System.out.println("Salvando no banco de dados: '" + dado + "'");
        this.dadosArmazenados = dado;
    }

    @Override
    public String ler() {
        System.out.println("Lendo dados do banco de dados.");
        return this.dadosArmazenados;
    }
}
