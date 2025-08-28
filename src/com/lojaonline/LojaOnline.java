package com.lojaonline;

import com.lojaonline.envio.GerenciadorEnvio;
import com.lojaonline.pagamento.CartaoCredito;
import com.lojaonline.pagamento.MetodoPagamento;
import com.lojaonline.pagamento.ProcessadorPagamento;
import com.lojaonline.pedido.Pedido;
import com.lojaonline.produtos.Produto;
import com.lojaonline.repositorio.JpaPedidoRepositorio;
import com.lojaonline.repositorio.PedidoRepositorio;
import com.lojaonline.servicos.ServicoPedido;
import java.util.List;

public class LojaOnline {
  public static void main(String[] args) {
    PedidoRepositorio repositorio = new JpaPedidoRepositorio();
    MetodoPagamento cartao = new CartaoCredito();
    ProcessadorPagamento processador = new ProcessadorPagamento(cartao);
    GerenciadorEnvio gerenciador = new GerenciadorEnvio();

    // Injeto as dependências no ServicoPedido

    ServicoPedido servicoPedido = new ServicoPedido(repositorio, processador, gerenciador);

    Produto motoserra = new Produto("Motoserra", 1500.00);
    Produto capacete = new Produto("Capacete", 300.00);
    Produto luvas = new Produto("Luvas", 50.00);
    List itens = List.of(motoserra, capacete, luvas);

    Pedido pedido = new Pedido(itens, "Rua das Flores, 123");
    servicoPedido.criarNovoPedido(pedido);
    servicoPedido.processarPedido(1L);
    servicoPedido.enviarPedido(1l);
  }

}
