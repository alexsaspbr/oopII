package com.lojaonline.pagamento;

public class ProcessadorPagamento<T extends MetodoPagamento> {
  T metodoPagamento;

  public ProcessadorPagamento(T metodoPagamento) {
    this.metodoPagamento = metodoPagamento;
  }


  public void processar(double valor) {
    metodoPagamento.processarPagamento(valor);
  }


}
