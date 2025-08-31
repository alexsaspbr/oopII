package com.lojaonline.pagamento;

// DIP: porta de alto nível para o serviço depender.
public interface PagamentoPort {
    void pagar(double valor);
}
