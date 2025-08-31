package com.lojaonline.repositorio;

import com.lojaonline.pedido.Pedido;
import java.util.List;
import java.util.Optional;

// ISP + DIP: contrato específico (nada de Object).
public interface PedidoRepositorio {
    void salvar(Pedido pedido);
    Optional<Pedido> buscarPorId(long id);
    List<Pedido> buscarPorStatus(String status);
}
