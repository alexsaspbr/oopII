package Desafio8;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {
    protected List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        lista.add(obj);
    }

    public interface Identificavel {
        int getId();
    }
    @Override
    public T buscarPorId(int id) {
        for (T obj : lista) {
            if (getId(obj) == id) {
                return obj;
            }
        }
        return null;
    }

    protected abstract int getId(T obj);

    @Override
    public List<T> listarTodos() {
        return lista;
    }

}
