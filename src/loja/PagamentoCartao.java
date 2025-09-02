package loja;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processar(Pedido pedido) {
        System.out.println("Pagamento com cartão aprovado para " + pedido.getCliente());
        return true;
    }
}

