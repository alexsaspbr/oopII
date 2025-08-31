package com.lojaonline.servicos;

import com.lojaonline.envio.EnvioPort;
import com.lojaonline.pagamento.PagamentoPort;
import com.lojaonline.pedido.Pedido;
import com.lojaonline.pedido.StatusPedido;
import com.lojaonline.repositorio.PedidoRepositorio;

// SRP: orquestra o fluxo; DIP: depende só de portas.
public class ServicoPedido {
    private final PedidoRepositorio repo;
    private final PagamentoPort pagamento;
    private final EnvioPort envio;

    public ServicoPedido(PedidoRepositorio repo, PagamentoPort pagamento, EnvioPort envio) {
        this.repo = repo;
        this.pagamento = pagamento;
        this.envio = envio;
    }

    public long criarNovoPedido(Pedido pedido) {
        repo.salvar(pedido);
        System.out.println("Novo pedido criado! id=" + pedido.getId());
        return pedido.getId();
    }

    public void processarPedido(long id) {
        var pedido = repo.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));
        if (pedido.getStatus() != StatusPedido.PENDENTE) {
            throw new IllegalStateException("Apenas pedidos PENDENTES podem ser pagos.");
        }
        pagamento.pagar(pedido.calcularTotal());
        pedido.setStatus(StatusPedido.PAGO);
        repo.salvar(pedido);
        System.out.println("Pedido pago com sucesso!");
    }

    public void enviarPedido(long id) {
        var pedido = repo.buscarPorId(id).orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado"));
        if (pedido.getStatus() != StatusPedido.PAGO) {
            throw new IllegalStateException("Só é possível enviar pedidos pagos.");
        }
        envio.enviarPara(pedido.getEnderecoEntrega());
        pedido.setStatus(StatusPedido.ENVIADO);
        repo.salvar(pedido);
        System.out.println("Pedido enviado com sucesso!");
    }
}
