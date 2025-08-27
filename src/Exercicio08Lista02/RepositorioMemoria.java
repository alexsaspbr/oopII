package Exercicio08Lista02;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T extends Identificavel> implements Repositorio<T> {


    protected final List<T> dados = new ArrayList<>();

    @Override
    public void salvar(T obj) {

        dados.add(obj);
    }

    @Override
    public T buscarPorId(int id) {
        for (T obj : dados) {
            if (obj.getId() == id) return obj;
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(dados);
    }
}
