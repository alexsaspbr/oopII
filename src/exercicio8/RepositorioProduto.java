package exercicio8;

public class RepositorioProduto extends RepositorioMemoria<Produto> {

    @Override
    public int getId(Produto prod) {
        return prod.getId();
    }
}
