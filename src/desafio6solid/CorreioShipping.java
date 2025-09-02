package desafio6solid;

public class CorreiosShipping implements Shipping {
    @Override
    public void shipOrder(String orderId) {
        System.out.println("Enviando pedido " + orderId + " pelos Correios");
    }
}