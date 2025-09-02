package loja;

public class EnvioCorreios implements Envio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado pelos Correios para " + pedido.getCliente());
    }
}

