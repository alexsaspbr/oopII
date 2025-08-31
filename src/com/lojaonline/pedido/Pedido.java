package com.lojaonline.pedido;

import com.lojaonline.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

// SRP: dados e regras do pedido (sem pagar/enviar aqui).
public class Pedido {
    private Long id;
    private final List<Produto> itens = new ArrayList<>();
    private StatusPedido status = StatusPedido.PENDENTE;
    private final String enderecoEntrega;

    public Pedido(List<Produto> itens, String enderecoEntrega) {
        if (itens != null) itens.forEach(this.itens::add);
        this.enderecoEntrega = enderecoEntrega;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public StatusPedido getStatus() { return status; }
    public void setStatus(StatusPedido status) { this.status = status; }

    public String getEnderecoEntrega() { return enderecoEntrega; }
    public List<Produto> getItens() { return List.copyOf(itens); }

    public void addItem(Produto p) { itens.add(p); }
    public void removerItem(Produto p) { itens.remove(p); }

    public double calcularTotal() {
        return itens.stream().mapToDouble(Produto::getPreco).sum();
    }
}
