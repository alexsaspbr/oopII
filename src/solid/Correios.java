package solid;

public class Correios implements ServicoEnvio {
    @Override
    public boolean enviar(Pedido pedido) {
        System.out.println("Enviando pedido via Correios...");
        return true;
    }
}
