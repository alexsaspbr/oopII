package com.lojaonline.pagamento;

// LSP: qualquer MetodoPagamento pode ser plugado sem quebrar cliente.
// DIP/ISP: expõe apenas PagamentoPort para o serviço.
public class ProcessadorPagamento<T extends MetodoPagamento> implements PagamentoPort {
    private final T metodo;

    public ProcessadorPagamento(T metodo) {
        this.metodo = metodo;
    }

    @Override
    public void pagar(double valor) {
        metodo.processarPagamento(valor);
    }
}
