package exemplo.exercicios.shipping;

import exemplo.exercicios.order.Order;

public interface ShippingService {
    void shipOrder(Order order);
    String getShippingMethod();
    double calculateShippingCost(Order order);
}
