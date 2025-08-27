package Desafio8;

public class Main {
    public static void main(String[] args) {
        Repositorio<Cliente> repoCliente = new RepositorioCliente();
        Repositorio<Produto> repoProduto = new RepositorioProduto();

        Cliente cliente1 = new Cliente(1, "Pedro", "joao@bla.com");
        Cliente cliente2 = new Cliente(2, "Zeca", "maria@bla.com");
        Produto produto1 = new Produto(1, "Tv", 3500.00);
        Produto produto2 = new Produto(2, "Armario", 1500.00);

        repoCliente.salvar(cliente1);
        repoCliente.salvar(cliente2);
        repoProduto.salvar(produto1);
        repoProduto.salvar(produto2);

        System.out.println("Clientes:");
        for (Cliente c : repoCliente.listarTodos()) {
            System.out.println("ID: " + c.getId() + ", Nome: " + c.getNome() + ", Email: " + c.getEmail());
        }

        System.out.println("\nProdutos:");
        for (Produto p : repoProduto.listarTodos()) {
            System.out.println("ID: " + p.getId() + ", Nome: " + p.getNome() + ", Preço: " + p.getPreco());
        }

        Cliente buscaCliente = repoCliente.buscarPorId(1);
        Produto buscaProduto = repoProduto.buscarPorId(2);

        System.out.println("\nBusca por ID:");
        if (buscaCliente != null) {
            System.out.println("Cliente - ID: " + buscaCliente.getId() + ", Nome: " + buscaCliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        if (buscaProduto != null) {
            System.out.println("Produto - ID: " + buscaProduto.getId() + ", Nome: " + buscaProduto.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}
