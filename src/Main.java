import ExercicioFinal6.envio.GerenciadorEnvio;
import ExercicioFinal6.model.Pedido;
import ExercicioFinal6.model.Produto;
import ExercicioFinal6.pagamento.CartaoCredito;
import ExercicioFinal6.pagamento.MetodoPagamento;
import ExercicioFinal6.pagamento.ProcessarPagamento;
import ExercicioFinal6.repository.JpaPedidoRepositorio;
import ExercicioFinal6.repository.PedidoRepositorio;
import ExercicioFinal6.service.PedidoService;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        PedidoRepositorio pedidoRepositorio = new JpaPedidoRepositorio();

        MetodoPagamento pagamentoCartao = new CartaoCredito();
        ProcessarPagamento processadorPagamento = new ProcessarPagamento(pagamentoCartao);

        GerenciadorEnvio gerenciadorEnvio = new GerenciadorEnvio();

        PedidoService pedidoService = new PedidoService(pedidoRepositorio, processadorPagamento, gerenciadorEnvio);

        Produto motoserra = new Produto("Motosserra Husqvarna", 1500.00);
        Produto capacete = new Produto("Capacete de Segurança", 300.00);
        Produto luvas = new Produto("Luvas Anticorte", 50.00);

        List<Produto> itensPedido = List.of(motoserra, capacete, luvas);

        Pedido pedido = new Pedido(itensPedido, "Rua das Flores, 123 - São Paulo/SP");

        // fluxo do caso de uso
        pedidoService.criarNovoPedido(pedido);
        pedidoService.processarPagamento(1L);
        pedidoService.despacharPedido(1L);

   /*     //Perecivel produto = new Produto();
        //processar(produto);

        //ICMS, IOF

        Imposto IOF = new IOF(1.5D);
        Imposto ICMS = new ICMS(2.7D);

        //new IVA(27D);

        //calcular(IOF);
        calcular(ICMS);
        //calcular(IVA);

        ImpostoRecord iva = new ImpostoRecord("2", "IVA");
        //iva.taxa();

        Comparator<Produto> compImposto = Comparator.comparing(Produto::getId)
                                                    .thenComparing(Produto::getValor);
        //compImposto.compare(new Produto(), new Produto());

        Integer numero = Integer.valueOf(10);
        System.out.printf("O numeros sao iguais %d", numero.compareTo(Integer.valueOf(15)));





        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(2,  "TV 55", new BigDecimal(4500)));
        produtos.add(new Produto(1,  "PS 5", new BigDecimal(3800)));
        Collections.sort(produtos);
        Collections.sort(produtos, Comparator.comparing(Produto::getValor));
        produtos.sort((p1, p2) -> p1.getId().compareTo(p2.getId()));


    }

    public static void calcular(Imposto imposto) {
        imposto.imprimir();*/
    }
}