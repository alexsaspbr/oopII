package com.lojaonline.pagamento;

public class Pix implements MetodoPagamento{

  @Override
  public void processarPagamento(double valor) {
    System.out.println("Processando pagamento via Pix no valor de: R$" + valor);
  }
}
