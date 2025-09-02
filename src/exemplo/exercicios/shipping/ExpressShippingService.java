package exemplo.exercicios.shipping;

import exemplo.exercicios.order.Order;

public class ExpressShippingService implements ShippingService {
    private static final double EXPRESS_RATE = 12.99;
    private static final double WEIGHT_RATE = 1.5; // per kg

    @Override
    public void shipOrder(Order order) {
        System.out.println("Shipping order " + order.getOrderId() + " via Express Shipping");
        System.out.println("Priority handling applied");
    }

    @Override
    public String getShippingMethod() {
        return "Express Shipping";
    }

    @Override
    public double calculateShippingCost(Order order) {
        // For simplicity, we'll assume each item weighs 1kg
        int itemCount = order.getItems().stream()
                .mapToInt(item -> item.getQuantity())
                .sum();
        return EXPRESS_RATE + (itemCount * WEIGHT_RATE);
    }
}
