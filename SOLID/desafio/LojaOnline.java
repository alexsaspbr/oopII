package desafio;

import desafio.interfaces.MetodoEnvio;
import desafio.interfaces.MetodoPagamento;
import desafio.model.*;
import desafio.service.GerenciadorPedidosImpl;
import desafio.service.ProcessadorPagamento;
import desafio.service.ServicoEnvio;

import java.util.Arrays;
import java.util.List;

public class LojaOnline {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE PEDIDOS ===");
        
        // Inicialização dos serviços
        ProcessadorPagamento processador = new ProcessadorPagamento();
        ServicoEnvio servicoEnvio = new ServicoEnvio();
        GerenciadorPedidosImpl gerenciador = new GerenciadorPedidosImpl(processador, servicoEnvio);

        // Métodos de pagamento disponíveis (demonstrando OCP)
        MetodoPagamento pagamentoCartao = new CartaoCredito();
        MetodoPagamento pagamentoPayPal = new PayPal();
        MetodoPagamento pagamentoPix = new Pix();
        
        // Método de envio
        MetodoEnvio envioSedex = new Sedex();

        System.out.println("\n=== EXEMPLO 1: Pedido com Cartão de Crédito ===");
        List<Item> itensPedido1 = Arrays.asList(
                new Item("Smartphone", 1500.0, 1, 0.3),
                new Item("Capa Protetora", 50.0, 1, 0.1)
        );
        Pedido pedido1 = new Pedido(itensPedido1, pagamentoCartao, envioSedex);
        gerenciador.adicionarPedido(pedido1);
        
        System.out.println("ID do Pedido: " + pedido1.getId());
        System.out.println("Total: R$" + pedido1.getValorTotal());
        System.out.println("Custo de Envio: R$" + pedido1.getCustoEnvio());
        System.out.println("Status: " + pedido1.getStatus());
        
        // Processando pagamento
        gerenciador.processarPagamentoPedido(pedido1.getId());
        System.out.println("Status após pagamento: " + pedido1.getStatus());
        
        // Enviando pedido
        gerenciador.enviarPedido(pedido1.getId());
        System.out.println("Status final: " + pedido1.getStatus());

        System.out.println("\n=== EXEMPLO 2: Pedido com PayPal ===");
        List<Item> itensPedido2 = Arrays.asList(
                new Item("Notebook", 3500.0, 1, 2.0)
        );
        Pedido pedido2 = new Pedido(itensPedido2, pagamentoPayPal, envioSedex);
        gerenciador.adicionarPedido(pedido2);
        
        System.out.println("ID do Pedido: " + pedido2.getId());
        System.out.println("Total: R$" + pedido2.getValorTotal());
        System.out.println("Custo de Envio: R$" + pedido2.getCustoEnvio());
        System.out.println("Status: " + pedido2.getStatus());
        
        // Processando pagamento
        gerenciador.processarPagamentoPedido(pedido2.getId());
        System.out.println("Status após pagamento: " + pedido2.getStatus());
        
        // Enviando pedido
        gerenciador.enviarPedido(pedido2.getId());
        System.out.println("Status final: " + pedido2.getStatus());

        System.out.println("\n=== EXEMPLO 3: Pedido com Pix (nova forma de pagamento) ===");
        List<Item> itensPedido3 = Arrays.asList(
                new Item("Fones de Ouvido", 200.0, 1, 0.2),
                new Item("Carregador", 80.0, 1, 0.1)
        );
        Pedido pedido3 = new Pedido(itensPedido3, pagamentoPix, envioSedex);
        gerenciador.adicionarPedido(pedido3);
        
        System.out.println("ID do Pedido: " + pedido3.getId());
        System.out.println("Total: R$" + pedido3.getValorTotal());
        System.out.println("Custo de Envio: R$" + pedido3.getCustoEnvio());
        System.out.println("Status: " + pedido3.getStatus());
        
        // Processando pagamento
        gerenciador.processarPagamentoPedido(pedido3.getId());
        System.out.println("Status após pagamento: " + pedido3.getStatus());
        
        // Enviando pedido
        gerenciador.enviarPedido(pedido3.getId());
        System.out.println("Status final: " + pedido3.getStatus());
        
        // Demonstrando cancelamento de pedido
        System.out.println("\n=== EXEMPLO 4: Cancelamento de Pedido ===");
        List<Item> itensPedido4 = Arrays.asList(
                new Item("Mouse", 100.0, 1, 0.1)
        );
        Pedido pedido4 = new Pedido(itensPedido4, pagamentoCartao, envioSedex);
        gerenciador.adicionarPedido(pedido4);
        
        System.out.println("ID do Pedido: " + pedido4.getId());
        System.out.println("Status inicial: " + pedido4.getStatus());
        
        // Cancelando pedido
        gerenciador.cancelarPedido(pedido4.getId());
        System.out.println("Status após cancelamento: " + pedido4.getStatus());
    }
}
