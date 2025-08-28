package com.lojaonline.servicos;


// com.lojaonline.servicos.ServicoPedido.java
import com.lojaonline.pedido.Pedido;
import com.lojaonline.repositorio.PedidoRepositorio;
import com.lojaonline.pagamento.ProcessadorPagamento;
import com.lojaonline.envio.GerenciadorEnvio;
public class ServicoPedido {
  private final PedidoRepositorio pedidoRepositorio;
  private final ProcessadorPagamento processadorPagamento;
  private final GerenciadorEnvio gerenciadorEnvio;

  public ServicoPedido(PedidoRepositorio pedidoRepositorio,
                      ProcessadorPagamento processadorPagamento,
                      GerenciadorEnvio gerenciadorEnvio) {
    this.pedidoRepositorio = pedidoRepositorio;
    this.processadorPagamento = processadorPagamento;
    this.gerenciadorEnvio = gerenciadorEnvio;
  }

  public void criarNovoPedido(Pedido pedido) {
    pedidoRepositorio.salvar(pedido);
    System.out.println("Novo pedido criado com sucesso!");
  }

  public void processarPedido(long pedidoId) {
    Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);
    if (pedido == null) {
      System.out.println("Pedido não encontrado!");
      return;
    }
    processadorPagamento.processar(pedido.calcularTotal());
    pedido.setStatus("Pago");
    pedidoRepositorio.salvar(pedido);
    System.out.println("Pedido pago com sucesso!");
  }

  public void enviarPedido(long pedidoId) {
    Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);
    if (pedido == null) {
      System.out.println("Pedido não encontrado!");
      return;
    }
    gerenciadorEnvio.enviarPedido(pedido.getEnderecoEntrega());
    pedido.setStatus("Enviado");
    pedidoRepositorio.salvar(pedido);
    System.out.println("Pedido enviado com sucesso!");
  }

}
