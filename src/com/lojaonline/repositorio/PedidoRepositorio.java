package com.lojaonline.repositorio;

import com.lojaonline.pedido.Pedido;
import java.util.List;

public interface PedidoRepositorio extends Repositorio {

  void salvar(Pedido pedido);

  Pedido buscarPorId(long id);

  List<Pedido> buscarPorStatus(String status);

}
