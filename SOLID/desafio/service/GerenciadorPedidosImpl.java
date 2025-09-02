package desafio.service;

import desafio.interfaces.GerenciadorPedidos;
import desafio.Pedido;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorPedidosImpl implements GerenciadorPedidos {
    private final Map<String, Pedido> pedidos = new HashMap<>();
    private final ProcessadorPagamento processadorPagamento;
    private final ServicoEnvio servicoEnvio;

    public GerenciadorPedidosImpl(ProcessadorPagamento processadorPagamento, ServicoEnvio servicoEnvio) {
        this.processadorPagamento = processadorPagamento;
        this.servicoEnvio = servicoEnvio;
    }

    @Override
    public void adicionarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
    }

    @Override
    public void cancelarPedido(String idPedido) {
        Pedido pedido = buscarPedido(idPedido);
        if (pedido != null && !pedido.getStatus().equals("Enviado")) {
            pedido.setStatus("Cancelado");
        }
    }

    @Override
    public Pedido buscarPedido(String idPedido) {
        return pedidos.get(idPedido);
    }

    @Override
    public void atualizarStatusPedido(String idPedido, String novoStatus) {
        Pedido pedido = buscarPedido(idPedido);
        if (pedido != null) {
            pedido.setStatus(novoStatus);
        }
    }

    public boolean processarPagamentoPedido(String idPedido) {
        Pedido pedido = buscarPedido(idPedido);
        if (pedido != null && pedido.getStatus().equals("Pendente")) {
            boolean pagamentoProcessado = processadorPagamento.processar(pedido);
            if (pagamentoProcessado) {
                pedido.setStatus("Pago");
                return true;
            }
        }
        return false;
    }

    public boolean enviarPedido(String idPedido) {
        Pedido pedido = buscarPedido(idPedido);
        if (pedido != null && pedido.getStatus().equals("Pago")) {
            boolean pedidoEnviado = servicoEnvio.enviarPedido(pedido);
            if (pedidoEnviado) {
                pedido.setStatus("Enviado");
                return true;
            }
        }
        return false;
    }
}