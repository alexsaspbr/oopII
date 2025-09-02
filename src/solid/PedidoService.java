package solid;

public class PedidoService {
    private ProcessadorPagamento processadorPagamento;
    private ServicoEnvio servicoEnvio;

    // Injeção de dependência via construtor
    public PedidoService(ProcessadorPagamento processadorPagamento, ServicoEnvio servicoEnvio) {
        this.processadorPagamento = processadorPagamento;
        this.servicoEnvio = servicoEnvio;
    }

    public void finalizarPedido(Pedido pedido, MetodoPagamento metodoPagamento) {
        if (processadorPagamento.processar(pedido, metodoPagamento)) {
            pedido.setStatus("PAGO");
            if (servicoEnvio.enviar(pedido)) {
                pedido.setStatus("ENVIADO");
                System.out.println("Pedido finalizado com sucesso!");
            }
        }
    }
}