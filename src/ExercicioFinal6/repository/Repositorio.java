package ExercicioFinal6.repository;

import java.util.List;

public interface Repositorio<T, ID> {
    void salvar(T entity);
    void atualizar(T entity);
    void deletar(T entity);
    T buscarPorId(ID id);
    List<T> buscarTodos();
}
