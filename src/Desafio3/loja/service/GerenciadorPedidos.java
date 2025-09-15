package Desafio3.loja.service;

import Desafio3.loja.interfaces.*;
import Desafio3.loja.model.Pedido;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    private final ProcessadorPagamento processadorPagamento;
    private final ServicoEnvio servicoEnvio;
    private final NotificadorCliente notificador;
    private final CalculadorFrete calculadorFrete;
    private final List<Pedido> pedidos;

    public GerenciadorPedidos(ProcessadorPagamento processadorPagamento,
                              ServicoEnvio servicoEnvio,
                              NotificadorCliente notificador,
                              CalculadorFrete calculadorFrete) {
        this.processadorPagamento = processadorPagamento;
        this.servicoEnvio = servicoEnvio;
        this.notificador = notificador;
        this.calculadorFrete = calculadorFrete;
        this.pedidos = new ArrayList<>();
    }

    public boolean criarPedidos(Pedido pedido) {
        System.out.println("\n=== CRIANDO PEDIDOS ===");

        double frete = calculadorFrete.calcularFrete(pedido.getCepDestino());
        double valorComFrete = pedido.getValorTotal() + frete;

        double desconto = 0;
        if (processadorPagamento instanceof CalculadorDesconto) {
            desconto = ((CalculadorDesconto) processadorPagamento).calcularDesconto(valorComFrete);
        }

        double valorFinal = valorComFrete - desconto;

        System.out.println("Valor original: R$ " + pedido.getValorTotal());
        System.out.println("Frete: R$ " + frete);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Valor final: R$ " + valorFinal);

        if (processadorPagamento.processarPagamento(valorFinal)) {
            pedido.setStatus("PAGO");
            pedidos.add(pedido);

            notificador.notificarCliente("Pedido " + pedido.getId() + " confirmado!");
            return true;
        }
        return false;
    }

    public boolean enviarPedido(String idPedido) {
        System.out.println("\n=== ENVIANDO PEDIDO ===");

        Pedido pedido = buscarPedido(idPedido);
        if (pedido != null && "PAGO".equals(pedido.getStatus())) {
            if (servicoEnvio.enviarPedido(pedido)) {
                pedido.setStatus("ENVIADO");
                notificador.notificarCliente("Pedido " + idPedido + " foi enviado!");
                return true;
            }

        }
        return false;
    }

    private Pedido buscarPedido(String id) {
        return pedidos.stream()
                      .filter(p -> p.getId().equals(id))
                      .findFirst()
                      .orElse(null);
    }

    public void listarPedidos() {
        System.out.println("\n=== LISTA DE PEDIDOS ===");
        pedidos.forEach(System.out::println);
    }
}
