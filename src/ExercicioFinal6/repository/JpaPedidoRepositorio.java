package ExercicioFinal6.repository;

import ExercicioFinal6.model.Pedido;
import java.util.List;

public class JpaPedidoRepositorio implements PedidoRepositorio {

    @Override
    public void salvar(Pedido pedido) {
    }

    @Override
    public void atualizar(Pedido pedido) {
    }

    @Override
    public void deletar(Pedido pedido) {
    }

    @Override
    public Pedido buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Pedido> buscarTodos() {
        return null;
    }

    @Override
    public List<Pedido> buscarPorStatus(String status) {
        return null;
    }
}
