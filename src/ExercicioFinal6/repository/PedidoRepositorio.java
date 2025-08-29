package ExercicioFinal6.repository;

import ExercicioFinal6.model.Pedido;

import java.util.List;

public interface PedidoRepositorio extends Repositorio<Pedido, Long> {
    List<Pedido> buscarPorStatus(String status);
}
