package Solid.Exercicio06;

import Solid.Exercicio06.pedido.Pedido;
import Solid.Exercicio06.produto.ProdutoPadrao;
import Solid.Exercicio06.pagamento.PagamentoCartaoCredito;
import Solid.Exercicio06.pagamento.PagamentoBoleto;
import Solid.Exercicio06.envio.EnvioCorreios;

public class LojaOnline {
    public static void main(String[] args) {
        // Criando produtos
        ProdutoPadrao produto1 = new ProdutoPadrao("Notebook", 3500.0);
        ProdutoPadrao produto2 = new ProdutoPadrao("Mouse", 120.0);
        
        // Criando pedido
        Pedido pedido = new Pedido();
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);
        
        // Processando pagamento com cartão de crédito
        System.out.println("=== Processando com cartão de crédito ===");
        pedido.setPagamento(new PagamentoCartaoCredito("1234 5678 9012 3456", "João Silva"));
        boolean pagamentoSucesso = pedido.processarPagamento();
        
        if (pagamentoSucesso) {
            System.out.println("Pedido finalizado com sucesso!");
            System.out.println("Total: R$" + pedido.calcularTotal());
            
            // Enviando pedido (DIP: dependendo da abstração, não da implementação)
            EnvioCorreios envio = new EnvioCorreios();
            envio.enviarPedido(pedido);
        }
        
        // Exemplo com boleto
        System.out.println("\n=== Processando com boleto ===");
        Pedido pedidoBoleto = new Pedido();
        pedidoBoleto.adicionarProduto(new ProdutoPadrao("Teclado", 250.0));
        pedidoBoleto.setPagamento(new PagamentoBoleto("12345678901234567890123456789012345678901234"));
        pedidoBoleto.processarPagamento();
    }
}
