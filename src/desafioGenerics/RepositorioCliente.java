package desafioGenerics;

import java.util.ArrayList;
import java.util.List;

public class RepositorioCliente extends RepositorioMemoria<Cliente> {

    @Override
    public void salvar(Cliente cliente) {
        cliente.setId(nextId++);
        super.salvar(cliente);
    }

    @Override
    protected int getIdElemento(Cliente cliente) {
        return cliente.getId();
    }

    // Método específico para clientes
    public List<Cliente> buscarPorDominioEmail(String dominio) {
        List<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : elementos) {
            if (cliente.getEmail().contains("@" + dominio)) {
                resultado.add(cliente);
            }
        }
        return resultado;
    }
}