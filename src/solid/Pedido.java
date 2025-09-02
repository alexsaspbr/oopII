package solid;

// Pedido.java
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<String> itens = new ArrayList<>();
    private String status;
    private double valorTotal;

    public Pedido(List<String> itens) {
        this.itens = itens;
        this.status = "PENDENTE";
        this.valorTotal = calcularValorTotal();
    }

    public void adicionarItem(String item) {
        this.itens.add(item);
        this.valorTotal = calcularValorTotal();
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private double calcularValorTotal() {
        // Lógica de cálculo (exemplo simplificado)
        return itens.size() * 10.0;
    }
}
