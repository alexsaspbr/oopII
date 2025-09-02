package loja;

public class Pedido {
    private String produto;
    private double valor;
    private String cliente;

    public Pedido(String produto, double valor, String cliente) {
        this.produto = produto;
        this.valor = valor;
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public String getCliente() {
        return cliente;
    }
}

