package desafio.model;

import desafio.interfaces.MetodoEnvio;
import desafio.interfaces.MetodoPagamento;
import desafio.Item;

import java.util.List;
import java.util.UUID;

public class Pedido {
    private String id;
    private List<Item> itens;
    private String status;
    private MetodoPagamento metodoPagamento;
    private MetodoEnvio metodoEnvio;
    private double valorTotal;
    private double custoEnvio;

    public Pedido(List<Item> itens, MetodoPagamento metodoPagamento, MetodoEnvio metodoEnvio) {
        this.id = UUID.randomUUID().toString();
        this.itens = itens;
        this.status = "Pendente";
        this.metodoPagamento = metodoPagamento;
        this.metodoEnvio = metodoEnvio;
        this.valorTotal = calcularTotal();
        this.custoEnvio = calcularCustoEnvio();
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
    }

    public double calcularCustoEnvio() {
        return this.metodoEnvio.calcularCustoEnvio(this);
    }

    public String getId() {
        return id;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public MetodoEnvio getMetodoEnvio() {
        return metodoEnvio;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public double getCustoEnvio() {
        return custoEnvio;
    }
}
