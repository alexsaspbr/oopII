package exemplo.exercicios.order;

import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> items;
    private OrderStatus status;
    
    public Order(String orderId, List<OrderItem> items) {
        this.orderId = orderId;
        this.items = items;
        this.status = OrderStatus.PENDING;
    }
    
    public double calculateTotal() {
        return items.stream()
                   .mapToDouble(OrderItem::getSubtotal)
                   .sum();
    }
    
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public OrderStatus getStatus() {
        return status;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public List<OrderItem> getItems() {
        return items;
    }
}


enum OrderStatus {
    PENDING, PAID, PROCESSING, SHIPPED, DELIVERED, CANCELLED
}
