package Desafio3.loja.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private List<String> itens;
    private double valorTotal;
    private String status;
    private LocalDateTime dataHora;
    private String cepDestino;

    public Pedido(String id, List<String> itens, double valorTotal, String cepDestino) {
        this.id = id;
        this.itens = new ArrayList<>(itens);
        this.valorTotal = valorTotal;
        this.status = "CRIADO";
        this.dataHora = LocalDateTime.now();
        this.cepDestino = cepDestino;
    }

    public String getId() {
        return id;
    }

    public List<String> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getCepDestino() {
        return cepDestino;
    }

    @Override
    public String toString() {
        return String.format("Pedido{id='%s', itens=%s, valor=%.2f, status='%s'}",
                id, itens, valorTotal, status);
    }
}
