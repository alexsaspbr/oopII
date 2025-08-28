import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {
    
    protected List<T> dados;
    
    public RepositorioMemoria() {
        this.dados = new ArrayList<>();
    }
    
    @Override
    public void salvar(T obj) {
        if (obj != null) {
            // Verifica se já existe um objeto com o mesmo ID
            int id = getId(obj);
            T existente = buscarPorId(id);
            
            if (existente != null) {
                // Remove o objeto existente e adiciona o novo
                dados.remove(existente);
            }
            
            dados.add(obj);
        }
    }
    
    @Override
    public T buscarPorId(int id) {
        for (T item : dados) {
            if (getId(item) == id) {
                return item;
            }
        }
        return null;
    }
    
    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(dados);
    }
    
    protected abstract int getId(T obj);
}
