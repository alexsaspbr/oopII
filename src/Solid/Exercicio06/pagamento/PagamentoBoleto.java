package Solid.Exercicio06.pagamento;

// OCP: Outro tipo de pagamento que pode ser adicionado facilmente
public class PagamentoBoleto implements Pagamento {
    private String codigoBarras;
    
    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Gerando boleto no valor de R$" + valor);
        System.out.println("Código de barras: " + codigoBarras);
        return true;
    }
}
