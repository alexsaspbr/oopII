import java.util.List;

public class TesteRepositorio {
    
    public static void main(String[] args) {
        System.out.println("=== Teste do Sistema de Repositório Genérico ===\n");
        
        testarRepositorioProdutos();
        
        System.out.println("\n" + "=".repeat(50) + "\n");
        
        testarRepositorioClientes();
    }
    
    private static void testarRepositorioProdutos() {
        System.out.println("--- Teste do Repositório de Produtos ---");
        
        Repositorio<Produto> repositorioProdutos = new RepositorioProduto();
        
        Produto produto1 = new Produto(1, "Notebook", 7500.00);
        Produto produto2 = new Produto(2, "Mouse", 150.00);
        Produto produto3 = new Produto(3, "Teclado", 155.00);

        System.out.println("Salvando produtos...");
        repositorioProdutos.salvar(produto1);
        repositorioProdutos.salvar(produto2);
        repositorioProdutos.salvar(produto3);
        
        System.out.println("\nListando todos os produtos:");
        List<Produto> todosProdutos = repositorioProdutos.listarTodos();
        for (Produto produto : todosProdutos) {
            System.out.println("  " + produto);
        }
        
        System.out.println("\nBuscando produto com ID 2:");
        Produto produtoEncontrado = repositorioProdutos.buscarPorId(2);
        if (produtoEncontrado != null) {
            System.out.println("  Produto encontrado: " + produtoEncontrado);
        } else {
            System.out.println("  Produto não encontrado");
        }
        
        System.out.println("\nBuscando produto com ID 999 (inexistente):");
        Produto produtoInexistente = repositorioProdutos.buscarPorId(999);
        if (produtoInexistente != null) {
            System.out.println("  Produto encontrado: " + produtoInexistente);
        } else {
            System.out.println("  Produto não encontrado (comportamento esperado)");
        }
        
        // Teste de atualização
        System.out.println("\nTestando atualização de produto existente:");
        Produto produtoAtualizado = new Produto(2, "Mouse Gamer", 200.00);
        repositorioProdutos.salvar(produtoAtualizado);
        System.out.println("  Produto atualizado: " + repositorioProdutos.buscarPorId(2));
    }
    
    private static void testarRepositorioClientes() {
        System.out.println("--- Teste do Repositório de Clientes ---");
        
        Repositorio<Cliente> repositorioClientes = new RepositorioCliente();
        
        Cliente cliente1 = new Cliente(1, "Elaine Soares", "elaine@email.com");
        Cliente cliente2 = new Cliente(2, "Alex Araujo", "alex@email.com");
        Cliente cliente3 = new Cliente(3, "Pedro Costa", "pedro@email.com");
        
        System.out.println("Salvando clientes...");
        repositorioClientes.salvar(cliente1);
        repositorioClientes.salvar(cliente2);
        repositorioClientes.salvar(cliente3);
        
        System.out.println("\nListando todos os clientes:");
        List<Cliente> todosClientes = repositorioClientes.listarTodos();
        for (Cliente cliente : todosClientes) {
            System.out.println("  " + cliente);
        }
        
        System.out.println("\nBuscando cliente com ID 1:");
        Cliente clienteEncontrado = repositorioClientes.buscarPorId(1);
        if (clienteEncontrado != null) {
            System.out.println("  Cliente encontrado: " + clienteEncontrado);
        } else {
            System.out.println("  Cliente não encontrado");
        }
        
        System.out.println("\nBuscando cliente com ID 999 (inexistente):");
        Cliente clienteInexistente = repositorioClientes.buscarPorId(999);
        if (clienteInexistente != null) {
            System.out.println("  Cliente encontrado: " + clienteInexistente);
        } else {
            System.out.println("  Cliente não encontrado (comportamento esperado)");
        }
        
        System.out.println("\nTestando atualização de cliente existente:");
        Cliente clienteAtualizado = new Cliente(1, "Elaine Soares Silva", "elaine.silva@email.com");
        repositorioClientes.salvar(clienteAtualizado);
        System.out.println("  Cliente atualizado: " + repositorioClientes.buscarPorId(1));
        
        System.out.println("\n=== Teste concluído com sucesso! ===");
    }
}

        
      