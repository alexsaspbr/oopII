package desafio;

import desafio.interfaces.MetodoEnvio;
import desafio.interfaces.MetodoPagamento;
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
        this.status = "PENDENTE";
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
        return metodoEnvio.calcularCustoEnvio(this);
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public MetodoEnvio getMetodoEnvio() {
        return metodoEnvio;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getCustoEnvio() {
        return custoEnvio;
    }

    public double getPesoTotal() {
        return itens.stream()
                .mapToDouble(item -> item.getPeso() * item.getQuantidade())
                .sum();
    }
}