package com.lojaonline.pagamento;

// ISP: contrato pequeno e específico.
public interface MetodoPagamento {
    void processarPagamento(double valor);
}
