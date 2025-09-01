package Solid.Exercicio06.pagamento;

// OCP: Nova forma de pagamento pode ser adicionada sem modificar o código existente
public class PagamentoCartaoCredito implements Pagamento {
    private String numeroCartao;
    private String nomeTitular;
    
    public PagamentoCartaoCredito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }
    
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via cartão de crédito");
        // Lógica de processamento do cartão de crédito
        return true;
    }
}
