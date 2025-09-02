public class RepositorioProduto extends RepositorioMemoria<Produto> {
    
    @Override
    protected int getId(Produto produto) {
        return produto.getId();
    }
}
