package Exercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class RelatorioViolaSRP {
    private List<String> dados;

    public RelatorioViolaSRP() {
        this.dados = new ArrayList<>();
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO DE VENDAS ===\n");
        relatorio.append("Data: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))).append("\n");
        relatorio.append("Total de vendas: ").append(dados.size()).append("\n");

        for (String item : dados) {
            relatorio.append("- ").append(item).append("\n");
        }

        return relatorio.toString();
    }

    public boolean enviarPorEmail(String destinatario, String assunto) {
        String conteudo = gerarRelatorio();

        System.out.println("Conectando ao servidor SMTP...");
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Email enviado com sucesso!");

        return true;
    }

    public boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }

    public void adicionarDado(String dado) {
        dados.add(dado);
    }
}
