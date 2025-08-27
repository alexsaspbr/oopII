package desafioGenerics;
import java.util.ArrayList;
import java.util.List;


public abstract class RepositorioMemoria<T> implements Repositorio<T> {
    protected List<T> elementos = new ArrayList<>();
    protected int nextId = 1;

    @Override
    public void salvar(T obj) {
        elementos.add(obj);
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(elementos);
    }

    @Override
    public T buscarPorId(int id) {
        for (T elemento : elementos) {
            if (getIdElemento(elemento) == id) {
                return elemento;
            }
        }
        return null;
    }

    // Método abstrato para obter ID do elemento
    protected abstract int getIdElemento(T elemento);
}