package desafioGenerics;
import java.util.ArrayList;
import java.util.List;

public class RepositorioProduto extends RepositorioMemoria<Produto> {

    @Override
    public void salvar(Produto produto) {
        produto.setId(nextId++);
        super.salvar(produto);
    }

    @Override
    protected int getIdElemento(Produto produto) {
        return produto.getId();
    }

    // Método específico para produtos
    public List<Produto> buscarPorPrecoMaiorQue(double precoMinimo) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto produto : elementos) {
            if (produto.getPreco() > precoMinimo) {
                resultado.add(produto);
            }
        }
        return resultado;
    }
}