package loja;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processar(Pedido pedido) {
        System.out.println("Pagamento via Pix aprovado para " + pedido.getCliente());
        return true;
    }
}

