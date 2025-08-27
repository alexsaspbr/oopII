package Exercicio08Lista02;

import java.util.List;

public class TesteRepositorio {
    public static void main(String[] args) {
        // --- PRODUTOS ---
        Repositorio<Produto> repoProduto = new RepositorioProduto();
        repoProduto.salvar(new Produto(1, "Notebook", 4500.00));
        repoProduto.salvar(new Produto(2, "Mouse", 120.00));
        repoProduto.salvar(new Produto(3, "Teclado", 300.00));

        System.out.println("Produtos (listarTodos):");
        List<Produto> produtos = repoProduto.listarTodos();
        produtos.forEach(System.out::println);

        System.out.println("\nProduto ID=2 (buscarPorId): " + repoProduto.buscarPorId(2));
        System.out.println("Produto ID=99 (buscarPorId): " + repoProduto.buscarPorId(99));

        // --- CLIENTES ---
        Repositorio<Cliente> repoCliente = new RepositorioCliente();
        repoCliente.salvar(new Cliente(101, "Carlos"));
        repoCliente.salvar(new Cliente(102, "Maria"));

        System.out.println("\nClientes (listarTodos):");
        List<Cliente> clientes = repoCliente.listarTodos();
        clientes.forEach(System.out::println);

        System.out.println("\nCliente ID=101 (buscarPorId): " + repoCliente.buscarPorId(101));
    }
}
