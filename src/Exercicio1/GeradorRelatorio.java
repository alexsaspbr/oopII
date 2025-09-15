package Exercicio1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GeradorRelatorio {
    private List<String> dados;

    public GeradorRelatorio() {
        this.dados = new ArrayList<>();
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("=== RELATÓRIO DE VENDAS ===\n");
        relatorio.append("Data: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))).append("\n");
        relatorio.append("Total de registros: ").append(dados.size()).append("\n\n");

        for (String item : dados) {
            relatorio.append("- ").append(item).append("\n");
        }

        return relatorio.toString();
    }

    public void adicionarDado(String dado) {
        dados.add(dado);
    }

    public List<String> getDados() {
        return new ArrayList<>(dados);
    }
}
