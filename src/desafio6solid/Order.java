package desafio6solid;

public class Order {
    private String id;
    private String customer;
    private double total;

    public Order(String id, String customer, double total) {
        this.id = id;
        this.customer = customer;
        this.total = total;
    }

    public String getId() { return id; }
    public String getCustomer() { return customer; }
    public double getTotal() { return total; }
}