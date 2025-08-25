package exercicios.questao08;

public class RepositorioCliente extends RepositorioMemoria<Cliente> {
    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente c : dados) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}
