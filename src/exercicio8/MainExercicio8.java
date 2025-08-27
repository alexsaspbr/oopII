package exercicio8;

import java.util.List;

public class MainExercicio8 {

    public static void main(String[] args) {

        System.out.println("=== Cliente ===");
        Repositorio<Cliente> repositorioCliente = new RepositorioCliente();

        Cliente cliente1 = new Cliente(1, "Paula", "paula@email.com");
        Cliente cliente2 = new Cliente(2, "Eduarda", "eduarda@email.com");

        repositorioCliente.salvar(cliente1);
        repositorioCliente.salvar(cliente2);

        try {
            repositorioCliente.salvar(cliente1);
        } catch (IllegalArgumentException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        int idClienteBuscado = 3;
        Cliente clienteBuscado = repositorioCliente.buscarPorId(idClienteBuscado);
        if (clienteBuscado != null) {
            System.out.printf("Cliente de id (%d) encontrado. Nome do Cliente: %s.%n", clienteBuscado.getId(), clienteBuscado.getNome());
        } else {
            System.out.printf("Nenhum cliente de id (%d) foi encontrado.%n", idClienteBuscado);
        }

        List<Cliente> clientes = repositorioCliente.listarTodos();
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("\n=== Produto ===");
        Repositorio<Produto> repositorioProduto = new RepositorioProduto();

        Produto produto1 = new Produto(1, "TV Smart 32 polegadas", 900.00);
        Produto produto2 = new Produto(2, "Geladeira Frost Free", 3000.00);

        repositorioProduto.salvar(produto1);
        repositorioProduto.salvar(produto2);

        int idProdutoBuscado = 1;
        Produto produtoBuscado = repositorioProduto.buscarPorId(idProdutoBuscado);
        if (produtoBuscado != null) {
            System.out.printf("Produto de id (%d) encontrado. Nome do produto: %s.%n", produtoBuscado.getId(), produtoBuscado.getNome());
        } else {
            System.out.printf("Nenhum produto de id (%d) foi encontrado.%n", idProdutoBuscado);
        }

        List<Produto> produtos = repositorioProduto.listarTodos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
