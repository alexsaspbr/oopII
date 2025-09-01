package Solid.Exercicio06.pagamento;

// DIP: Interface de alto nível para pagamentos
public interface Pagamento {
    boolean processarPagamento(double valor);
}
