package solid;

public class LivroFisico implements ProdutoFisico {
    @Override
    public void empacotar() {
        System.out.println("Empacotando o livro para envio.");
    }
}
