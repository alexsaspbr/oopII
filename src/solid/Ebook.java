package solid;

public class Ebook implements ProdutoDigital {
    @Override
    public void gerarLinkDownload() {
        System.out.println("Gerando link de download para o ebook.");
    }
}
