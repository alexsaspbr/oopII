package Desafio3.loja.main;

import Desafio3.loja.envio.EnvioCorreios;
import Desafio3.loja.envio.EnvioTransportadora;
import Desafio3.loja.model.Pedido;
import Desafio3.loja.notificacao.NotificadorEmail;
import Desafio3.loja.notificacao.NotificadorSMS;
import Desafio3.loja.notificacao.NotificadorWhatsApp;
import Desafio3.loja.pagamento.PagamentoBoleto;
import Desafio3.loja.pagamento.PagamentoCartaoCredito;
import Desafio3.loja.pagamento.PagamentoPix;
import Desafio3.loja.service.GerenciadorPedidos;

import java.util.List;

public class SistemaLojaOnline {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GERENCIAMENTO DE PEDIDOS - APLICANDO SOLID ===");

        System.out.println("CENÁRIO 1:  CARTÃO + CORREIOS + EMAIL");

        GerenciadorPedidos gerenciador1 = new GerenciadorPedidos(
                new PagamentoCartaoCredito(),
                new EnvioCorreios(),
                new NotificadorEmail(),
                new EnvioCorreios()
        );

        List<String> itens1 = List.of("Notebook", "Mouse", "Teclado");
        Pedido pedido1 = new Pedido("001", itens1, 2500.0, "01234-567");

        gerenciador1.criarPedidos(pedido1);
        gerenciador1.enviarPedido("001");
        gerenciador1.listarPedidos();

        System.out.println("\nCENÁRIO 2: PIX + TRANSPORTADORA + WHATSAPP");

        GerenciadorPedidos gerenciador2 = new GerenciadorPedidos(
                new PagamentoPix(),
                new EnvioTransportadora(),
                new NotificadorWhatsApp(),
                new EnvioTransportadora()
        );

        List<String> itens2 = List.of("Smartphone", "Capinha", "Carregador");
        Pedido pedido2 = new Pedido("002", itens2, 1200.0, "12345-678");

        gerenciador2.criarPedidos(pedido2);
        gerenciador2.enviarPedido("002");
        gerenciador2.listarPedidos();

        System.out.println("\n CENÁRIO 3: BOLETO + CORREIOS + SMS ");

        GerenciadorPedidos gerenciador3 = new GerenciadorPedidos(
                new PagamentoBoleto(),
                new EnvioCorreios(),
                new NotificadorSMS(),
                new EnvioCorreios()
        );
        List<String> itens3 = List.of("Livro Java", "Curso Online");
        Pedido pedido3 = new Pedido("003", itens3, 150.0, "87654-321");

        gerenciador3.criarPedidos(pedido3);
        gerenciador3.enviarPedido("003");
        gerenciador3.listarPedidos();


        System.out.println("\n DEMONSTRANDO EXTENSIBILIDADE (OCP): ");
        System.out.println("Novos métodos de pagamento podem ser adicionados sem modificar código existente");
        System.out.println("Novos serviços de envio podem ser implementados independentemente");
        System.out.println("Novos tipos de de notificação são plug-and-play");

        System.out.println("\n PRINCÍPIOS SOLID APLICADOS: ");
        System.out.println("SRP: Cada Classe tem uma responsabilidade específica");
        System.out.println("OCP: Sistema aberto para extensão, fechado para modificação");
        System.out.println("LSP: Implementações podem ser substituídas sem quebrar o sistema");
        System.out.println("ISP: Interfaces pequenas e focadas");
        System.out.println("DIP: Dependemos de abstrações, não de implementações");
    }
}
