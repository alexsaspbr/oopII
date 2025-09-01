package Solid.Exercicio01;

public class Relatorio {
    private String conteudo;
    
    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }
    
    public String gerarRelatorio() {
        return "Relatório gerado: " + conteudo;
    }
}
