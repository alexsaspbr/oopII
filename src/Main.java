import desafioGenerics.Cliente;
import desafioGenerics.Produto;
import desafioGenerics.RepositorioCliente;
import desafioGenerics.RepositorioProduto;
import exemplo.conversor.Conversor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE REPOSITÓRIO GENÉRICO ===\n");

        // Teste com Produtos
        testarRepositorioProduto();

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Teste com Clientes
        testarRepositorioCliente();
    }

    private static void testarRepositorioProduto() {
        System.out.println("📦 TESTANDO REPOSITÓRIO DE PRODUTOS");

        RepositorioProduto repoProduto = new RepositorioProduto();

        // Salvando produtos
        repoProduto.salvar(new Produto("Notebook Gamer", 3500.00));
        repoProduto.salvar(new Produto("Mouse Óptico", 89.90));
        repoProduto.salvar(new Produto("Teclado Mecânico", 299.00));
        repoProduto.salvar(new Produto("Monitor 24\"", 899.00));

        System.out.println("\n📋 Todos os produtos:");
        repoProduto.listarTodos().forEach(System.out::println);

        System.out.println("\n🔍 Buscando produto com ID 2:");
        Produto produto = repoProduto.buscarPorId(2);
        System.out.println(produto != null ? produto : "Produto não encontrado");

        System.out.println("\n💰 Produtos com preço maior que R$ 500,00:");
        repoProduto.buscarPorPrecoMaiorQue(500.00).forEach(System.out::println);

        System.out.println("\n❌ Buscando produto com ID inexistente (999):");
        Produto produtoInexistente = repoProduto.buscarPorId(999);
        System.out.println(produtoInexistente != null ? produtoInexistente : "Produto não encontrado");
    }

    private static void testarRepositorioCliente() {
        System.out.println("👥 TESTANDO REPOSITÓRIO DE CLIENTES");

        RepositorioCliente repoCliente = new RepositorioCliente();

        // Salvando clientes
        repoCliente.salvar(new Cliente("Ana Silva", "ana.silva@email.com"));
        repoCliente.salvar(new Cliente("Carlos Oliveira", "carlos.oliveira@empresa.com"));
        repoCliente.salvar(new Cliente("Maria Santos", "maria.santos@email.com"));
        repoCliente.salvar(new Cliente("João Pereira", "joao.pereira@outro.com"));

        System.out.println("\n Todos os clientes:");
        repoCliente.listarTodos().forEach(System.out::println);

        System.out.println("\n Buscando cliente com ID 1:");
        Cliente cliente = repoCliente.buscarPorId(1);
        System.out.println(cliente != null ? cliente : "Cliente não encontrado");

        System.out.println("\n Clientes com domínio 'email.com':");
        repoCliente.buscarPorDominioEmail("email.com").forEach(System.out::println);

        System.out.println("\n Buscando cliente com ID inexistente (999):");
        Cliente clienteInexistente = repoCliente.buscarPorId(999);
        System.out.println(clienteInexistente != null ? clienteInexistente : "Cliente não encontrado");
    }
}

