package desafio6solid;

public class ExpressShipping implements Shipping {
    @Override
    public void shipOrder(String orderId) {
        System.out.println("Enviando pedido " + orderId + " por transportadora expressa");
    }
}