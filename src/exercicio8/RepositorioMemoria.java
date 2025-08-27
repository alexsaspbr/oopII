package exercicio8;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {

    protected List<T> lista = new ArrayList<>();

    public abstract int getId(T obj);

    @Override
    public void salvar(T obj) {
        if (buscarPorId(getId(obj)) == null) {
            lista.add(obj);
        } else {
            throw new IllegalArgumentException("Objeto de mesmo ID já existe.");
        }
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

    @Override
    public List<T> listarTodos() {
        return lista;
    }
}
