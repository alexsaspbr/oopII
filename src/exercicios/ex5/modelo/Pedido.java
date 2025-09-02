package exercicios.ex5.modelo;

import exercicios.ex5.desconto.Desconto;
import exercicios.ex5.pagamento.Pagamento;

import java.time.LocalDate;

public class Pedido {
    private Integer id;
    private LocalDate data;
    private java.util.List<ItemPedido> itens;
    private Desconto desconto;
    private Pagamento pagamento;

    public Pedido(Integer id) {
        this.id = id;
        this.itens = new java.util.ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public java.util.List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public Desconto setDesconto(Desconto desconto) {
        return this.desconto = desconto;
    }

    public Pagamento setPagamento(Pagamento pagamento) {
        return this.pagamento = pagamento;
    }

    public java.math.BigDecimal calcularTotal() {
        return itens.stream()
                .map(ItemPedido::getPrecoTotal)
                .reduce(java.math.BigDecimal.ZERO, java.math.BigDecimal::add);
    }

    public java.math.BigDecimal calcularTotalComDesconto() {
        java.math.BigDecimal total = calcularTotal();
        if (desconto != null) {
            java.math.BigDecimal valorDesconto = desconto.desconto(total);
            total = total.subtract(valorDesconto);
        }
        return total;
    }

    public void executarPedido(){
        if(pagamento != null){
            setData(LocalDate.now());
            pagamento.pagar(calcularTotalComDesconto());
        }
        else {
            System.out.println("Pagamento nao definido");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido ID: ").append(id).append("\n");
        for(ItemPedido iten : itens){
            sb.append(iten.toString()).append("\n");
        }
        sb.append("Total: ").append(calcularTotal()).append("\n");
        return sb.toString();
    }
}
