package com.lojaonline;

import com.lojaonline.envio.GerenciadorEnvio;
import com.lojaonline.pagamento.*;
import com.lojaonline.pedido.Pedido;
import com.lojaonline.produtos.Produto;
import com.lojaonline.repositorio.EmMemoriaPedidoRepositorio;
import com.lojaonline.servicos.ServicoPedido;

import java.util.List;

public class LojaOnline {
    public static void main(String[] args) {
        var repo = new EmMemoriaPedidoRepositorio();

        // Posso trocar o metodo de pagamento livremente (OCP + LSP)
        PagamentoPort pagamento = new ProcessadorPagamento<>(new CartaoCredito());
        // PagamentoPort pagamento = new ProcessadorPagamento<>(new Pix());
        // PagamentoPort pagamento = new ProcessadorPagamento<>(new Boleto());

        var envio = new GerenciadorEnvio();
        var servico = new ServicoPedido(repo, pagamento, envio);

        var itens = List.of(
                new Produto("Motoserra", 1500.00),
                new Produto("Capacete", 300.00),
                new Produto("Luvas", 50.00)
        );

        var pedido = new Pedido(itens, "Rua das Flores, 123");
        long id = servico.criarNovoPedido(pedido);
        servico.processarPedido(id);
        servico.enviarPedido(id);
    }
}


