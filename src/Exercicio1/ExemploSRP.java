package Exercicio1;

public class ExemploSRP {
    public static void main(String[] args) {
        System.out.println("EXEMPLO VIOLANDO SRP:");
        System.out.println("=".repeat(50));

        RelatorioViolaSRP relatorioRuim = new RelatorioViolaSRP();
        relatorioRuim.adicionarDado("Venda 1: R$ 150,00");
        relatorioRuim.adicionarDado("Venda 2: R$ 300,00");
        relatorioRuim.adicionarDado("Venda 3: R$ 75,00");

        relatorioRuim.enviarPorEmail("cliente@email.com", "Relatório Mensal");

        System.out.println("\n" + "=".repeat(50));
        System.out.println("EXEMPLO APLICANDO SRP:");
        System.out.println("=".repeat(50));

        GeradorRelatorio gerador = new GeradorRelatorio();
        gerador.adicionarDado("Venda 1: R$ 150,00");
        gerador.adicionarDado("Venda 2: R$ 300,00");
        gerador.adicionarDado("Venda 3: R$ 75,00");

        ServicoEmail servicoEmail = new ServicoEmail();
        FormatadorRelatorio formatador = new FormatadorRelatorio();
        EnviadorRelatorio enviador = new EnviadorRelatorio(servicoEmail, formatador);

        String relatorio = gerador.gerarRelatorio();
        System.out.println("Relatório gerado:");
        System.out.println(relatorio);

        System.out.println("\n VANTAGENS DO SRP:");
        System.out.println(" Cada classe tem uma única razão para mudar");
        System.out.println(" Código mais fácil de testar");
        System.out.println(" Maior reutilização");
        System.out.println(" manutenção mais simples");
        System.out.println(" baixo acoplamento");

        System.out.println("\nDEMONSTRANDO FLEXIBILIDADE:");

        String relatorioTXTO = formatador.formatarParaTXT(relatorio);
        System.out.println(" Relatório salvo em TXT");

        servicoEmail.enviarEmail("admin@loja.com", "Sistema Online", "Sistema funcionando normalmente");

        System.out.println("\n Cada componente pode evoluir separadamente:");
        System.out.println("- GeradorRelatorio: adicionar novos tipos de relatório");
        System.out.println("- ServicoEmail: melhorar protocolo de envio");
        System.out.println("- FormatadorRelatorio: suportar novos formatos");
        System.out.println("- EnviadorRelatorio: adicionar retry, logs, etc.");
    }
}
