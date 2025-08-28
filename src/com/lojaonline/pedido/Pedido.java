package com.lojaonline.pedido;

import com.lojaonline.produtos.Produto;
import java.util.List;

public class Pedido {
  List<Produto> itens;
  String status;

  String enderecoEntrega;

  public Pedido(List<Produto> itens, String enderecoEntrega ) {
    this.itens = itens;
    this.status = "PENDENTE";
    this.enderecoEntrega = enderecoEntrega;
  }

  public List<Produto> getItens() {
    return itens;
  }

  public double calcularTotal() {
    return itens.stream().mapToDouble(Produto::getPreco).sum();
  }

  public void addItem(Produto produto) {
    itens.add(produto);
  }

  public void removerItem(Produto produto) {
    itens.remove(produto);
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getEnderecoEntrega() {
    return enderecoEntrega;
  }
}
