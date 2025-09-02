package exercicios.ex5.modelo;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private java.math.BigDecimal precoTotal;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = produto.getValor().multiply(new java.math.BigDecimal(quantidade));
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public java.math.BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Valor: " + precoTotal;
    }
}
