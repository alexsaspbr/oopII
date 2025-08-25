package exercios.interfaces.questao04;

public class ArquivoTexto implements Armazenamento{
    private String dados;

    @Override
    public void salvar(String dados){
        setDados(dados);
        System.out.println("Salvando dados no arquivo de texto: " + dados);
    }
    @Override
    public void ler(){
        if (getDados() != null){
            System.out.println("Lendo dados do arquivo de texto: " + getDados());
        } else {
            System.out.println("Nenhum dado salvo no arquivo de texto");
        }
    }

    public String getDados() {
        return dados;
    }
    public void setDados(String dados) {
        this.dados = dados;
    }
}
