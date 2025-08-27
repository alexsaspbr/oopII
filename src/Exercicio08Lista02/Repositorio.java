package Exercicio08Lista02;

import java.util.List;

public interface Repositorio<T extends Identificavel> {
    void salvar(T obj);
    T buscarPorId(int id);     // retorna null se não encontrar
    List<T> listarTodos();     // retorna uma cópia
}

