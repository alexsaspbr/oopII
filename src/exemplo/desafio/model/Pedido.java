package exemplo.desafio.model;

import exemplo.desafio.interfaces.MetodoEnvio;
import exemplo.desafio.interfaces.MetodoPagamento;

import java.util.List;

public class Pedido {
    private List<Item> itens;
    private String status;
    private MetodoPagamento metodoPagamento;
    private MetodoEnvio metodoEnvio;

    public Pedido(List<Item> itens, MetodoPagamento metodoPagamento, MetodoEnvio metodoEnvio) {
        this.itens = itens;
        this.status = "Pendente";
        this.metodoPagamento = metodoPagamento;
        this.metodoEnvio = metodoEnvio;
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
    }

    public double calcularCustoEnvio() {
        return this.metodoEnvio.calcularCustoEnvio(this);
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public List<Item> getItens() {
        return itens;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
