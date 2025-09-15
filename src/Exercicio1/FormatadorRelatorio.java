package Exercicio1;

public class FormatadorRelatorio {
    public String formatarParaEmail(String relatorio) {
        return "<html><body><pre>" + relatorio + "</pre></body></html>";
    }

    public String formatarParaPDF(String relatorio) {
        return "PDF_HEADER\n" + relatorio + "\nPDF_FOOTER";
    }

    public String formatarParaTXT(String relatorio) {
        return relatorio;
    }
}
