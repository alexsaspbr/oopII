package exercicio8;

public class RepositorioCliente extends RepositorioMemoria<Cliente> {

    @Override
    public int getId(Cliente cli) {
        return cli.getId();
    }
}
