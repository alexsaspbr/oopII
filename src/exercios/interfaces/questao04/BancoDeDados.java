package exercios.interfaces.questao04;

public class BancoDeDados implements Armazenamento {
    private String dados;

    @Override
    public void salvar(String dados){
        setDados(dados);
        System.out.println("Salvando dados no banco de dados: " + dados);
    }
    @Override
    public void ler(){
        if (getDados() != null){
            System.out.println("Lendo dados do banco de dados: " + getDados());
        } else {
            System.out.println("Nenhum dado salvo no banco de dados");
        }
    }

    public String getDados() {
        return dados;
    }
    public void setDados(String dados) {
        this.dados = dados;
    }
}
