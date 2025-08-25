package exercicios.questao08;

public class RepositorioProduto extends RepositorioMemoria<Produto> {
    @Override
    public Produto buscarPorId(int id) {
        for (Produto p : dados) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}
