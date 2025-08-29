package ExercicioFinal6.service;

import ExercicioFinal6.envio.GerenciadorEnvio;
import ExercicioFinal6.model.Pedido;
import ExercicioFinal6.pagamento.ProcessarPagamento;
import ExercicioFinal6.repository.PedidoRepositorio;

public class PedidoService {
    private final PedidoRepositorio pedidoRepositorio;
    private final ProcessarPagamento processadorPagamento;
    private final GerenciadorEnvio gerenciadorEnvio;

    public PedidoService(PedidoRepositorio pedidoRepositorio,
                         ProcessarPagamento processadorPagamento,
                         GerenciadorEnvio gerenciadorEnvio) {
        this.pedidoRepositorio = pedidoRepositorio;
        this.processadorPagamento = processadorPagamento;
        this.gerenciadorEnvio = gerenciadorEnvio;
    }

    public void criarNovoPedido(Pedido pedido) {
        pedidoRepositorio.salvar(pedido);
        System.out.println("Novo pedido criado com sucesso! ID ");
    }

    public void processarPagamento(long pedidoId) {
        Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);

        if (pedido == null) {
            System.err.println("Pedido não encontrado! ID: " + pedidoId);
            return;
        }

        if (!"PENDENTE".equalsIgnoreCase(pedido.getStatus())) {
            System.out.println("Pedido #" + pedidoId + " já foi processado. Status atual: " + pedido.getStatus());
            return;
        }

        processadorPagamento.processar(pedido.calcularTotal());
        pedido.setStatus("PAGO");
        pedidoRepositorio.atualizar(pedido);
        System.out.println("💳 Pedido #" + pedidoId + " pago com sucesso!");
    }

    public void despacharPedido(long pedidoId) {
        Pedido pedido = pedidoRepositorio.buscarPorId(pedidoId);

        if (pedido == null) {
            System.err.println("Pedido não encontrado! ID: " + pedidoId);
            return;
        }

        if (!"PAGO".equalsIgnoreCase(pedido.getStatus())) {
            System.out.println("Pedido #" + pedidoId + " não pode ser despachado. Status atual: " + pedido.getStatus());
            return;
        }

        gerenciadorEnvio.enviarPedido(pedido.getEnderecoEntrega());
        pedido.setStatus("ENVIADO");
        pedidoRepositorio.atualizar(pedido);
        System.out.println("Pedido #" + pedidoId + " enviado com sucesso!");
    }
}
