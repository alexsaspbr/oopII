package exercicios.questao08;

public class Main {
    public static void main(String[] args) {
        // Teste com Produto
        RepositorioProduto repoProduto = new RepositorioProduto();
        repoProduto.salvar(new Produto(1, "Notebook", 3500.0));
        repoProduto.salvar(new Produto(2, "Mouse", 80.0));
        repoProduto.salvar(new Produto(3, "Teclado", 120.0));

        System.out.println("Produtos cadastrados:");
        for (Produto p : repoProduto.listarTodos()) {
            System.out.println(p);
        }
        System.out.println("Buscar Produto id=2: " + repoProduto.buscarPorId(2));

        // Teste com Cliente
        RepositorioCliente repoCliente = new RepositorioCliente();
        repoCliente.salvar(new Cliente(1, "Ana", "ana@email.com"));
        repoCliente.salvar(new Cliente(2, "Carlos", "carlos@email.com"));
        repoCliente.salvar(new Cliente(3, "Bruna", "bruna@email.com"));

        System.out.println("\nClientes cadastrados:");
        for (Cliente c : repoCliente.listarTodos()) {
            System.out.println(c);
        }
        System.out.println("Buscar Cliente id=1: " + repoCliente.buscarPorId(1));
    }
}
