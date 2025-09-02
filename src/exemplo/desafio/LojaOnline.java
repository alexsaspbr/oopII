package exemplo.desafio;

import exemplo.desafio.interfaces.MetodoEnvio;
import exemplo.desafio.interfaces.MetodoPagamento;
import exemplo.desafio.model.*;
import exemplo.desafio.service.ProcessadorPagamento;
import exemplo.desafio.service.ServicoEnvio;

import java.util.Arrays;
import java.util.List;

public class LojaOnline {
    public static void main(String[] args) {
        //  Serviços
        ProcessadorPagamento processador = new ProcessadorPagamento();
        ServicoEnvio servicoEnvio = new ServicoEnvio();

        // Estrategias
        MetodoPagamento pagamentoCartao = new CartaoCredito();
        MetodoPagamento pagamentoPayPal = new PayPal();
        MetodoEnvio envioSedex = new Sedex();

        // Pedido 1 : Pago com Cartao de Credito
        List<Item> itensPedido1 = Arrays.asList(
                new Item("Produto A", 50.0, 2, 0.5),
                new Item("Produto B", 30.0, 1, 0.2)
        );
        Pedido pedido1 = new Pedido(itensPedido1, pagamentoCartao, envioSedex);

        System.out.printf("Total do pedido 1: R$%.2f%n", pedido1.calcularTotal());
        System.out.println("Status inicial: " + pedido1.getStatus());

        processador.processar(pedido1);
        System.out.println("Status após pagamento: " + pedido1.getStatus());

        servicoEnvio.enviarPedido(pedido1);
        System.out.println("Status final: " + pedido1.getStatus());

        System.out.println("\n" + "=".repeat(30) + "\n");

        List<Item> itensPedido2 = Arrays.asList(
                new Item("Produto C", 120.0, 1, 1.2)
        );
        Pedido pedido2 = new Pedido(itensPedido2, pagamentoPayPal, envioSedex);

        System.out.printf("Total do pedido 2: R$%.2f%n", pedido2.calcularTotal());
        System.out.println("Status inicial: " + pedido2.getStatus());

        processador.processar(pedido2);
        System.out.println("Status apos pagamento: " + pedido2.getStatus());

        servicoEnvio.enviarPedido(pedido2);
        System.out.println("Status final: " + pedido2.getStatus());
    }
}
