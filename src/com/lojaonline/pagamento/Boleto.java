package com.lojaonline.pagamento;

public class Boleto implements MetodoPagamento{

  @Override
  public void processarPagamento(double valor) {
    System.out.println("Processando pagamento via Boleto no valor de: R$" + valor);

  }
}
