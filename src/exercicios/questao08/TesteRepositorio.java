package exercicios.questao08;

public class TesteRepositorio {
    public static void main(String[] args) {
        RepositorioProduto repoProduto = new RepositorioProduto();
        repoProduto.salvar(new Produto(1, "Notebook", 3500.0));
        repoProduto.salvar(new Produto(2, "Mouse", 80.0));

        System.out.println("Produtos:");
        for (Produto p : repoProduto.listarTodos()) {
            System.out.println(p);
        }
        System.out.println("Buscar Produto id=2: " + repoProduto.buscarPorId(2));

        RepositorioCliente repoCliente = new RepositorioCliente();
        repoCliente.salvar(new Cliente(1, "Ana", "ana@email.com"));
        repoCliente.salvar(new Cliente(2, "Carlos", "carlos@email.com"));

        System.out.println("\nClientes:");
        for (Cliente c : repoCliente.listarTodos()) {
            System.out.println(c);
        }
        System.out.println("Buscar Cliente id=1: " + repoCliente.buscarPorId(1));
    }
}
