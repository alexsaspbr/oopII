package loja;

public class EnvioTransportadora implements Envio {
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado pela Transportadora para " + pedido.getCliente());
    }
}

