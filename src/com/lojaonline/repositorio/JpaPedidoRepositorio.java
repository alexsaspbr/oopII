package com.lojaonline.repositorio;

import com.lojaonline.pedido.Pedido;
import java.util.List;

public class JpaPedidoRepositorio implements PedidoRepositorio {

  @Override
  public void salvar(Pedido pedido) {

  }

  @Override
  public Pedido buscarPorId(long id) {
    return null;
  }

  @Override
  public List<Pedido> buscarPorStatus(String status) {
    return null;
  }

  @Override
  public void salvar(Object obj) {

  }

  @Override
  public void atualizar(Object obj) {

  }

  @Override
  public void deletar(Object obj) {

  }

  @Override
  public Object buscarPorId(int id) {
    return null;
  }

  @Override
  public List<Object> buscarTodos() {
    return null;
  }
}
