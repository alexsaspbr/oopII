package Solid.Exercicio06.pedido;

import Solid.Exercicio06.pagamento.Pagamento;
import Solid.Exercicio06.produto.Produto;

import java.util.ArrayList;
import java.util.List;

// SRP: Responsável apenas por gerenciar um pedido
public class Pedido {
    private List<Produto> produtos;
    private Pagamento pagamento;
    
    public Pedido() {
        this.produtos = new ArrayList<>();
    }
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public double calcularTotal() {
        return produtos.stream()
                     .mapToDouble(Produto::getPreco)
                     .sum();
    }
    
    public boolean processarPagamento() {
        if (pagamento == null) {
            return false;
        }
        return pagamento.processarPagamento(this.calcularTotal());
    }
}
