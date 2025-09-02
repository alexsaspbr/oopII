package solid;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(List.of("Câmera", "Tripé"));

        // OCP: criando um novo metodo de pagamento
        MetodoPagamento pagamentoCartao = new CartaoCredito();
        MetodoPagamento pagamentoPaypal = new Paypal();

        // DIP: injetando dependências
        ProcessadorPagamento processador = new ProcessadorPagamento();
        ServicoEnvio servicoEnvio = new Correios();

        PedidoService pedidoService = new PedidoService(processador, servicoEnvio);

        // Finalizando pedido com diferentes métodos de pagamento
        pedidoService.finalizarPedido(pedido, pagamentoCartao);
        // Ou
        // pedidoService.finalizarPedido(pedido, pagamentoPaypal);
    }
}