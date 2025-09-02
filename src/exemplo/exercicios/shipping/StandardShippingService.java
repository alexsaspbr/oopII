package exemplo.exercicios.shipping;

import exemplo.exercicios.order.Order;

public class StandardShippingService implements ShippingService {
    private static final double STANDARD_RATE = 5.99;
    private static final double FREE_SHIPPING_THRESHOLD = 50.00;

    @Override
    public void shipOrder(Order order) {
        System.out.println("Shipping order " + order.getOrderId() + " via Standard Shipping");
    }

    @Override
    public String getShippingMethod() {
        return "Standard Shipping";
    }

    @Override
    public double calculateShippingCost(Order order) {
        double subtotal = order.calculateTotal();
        return subtotal >= FREE_SHIPPING_THRESHOLD ? 0 : STANDARD_RATE;
    }
}
