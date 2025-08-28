package com.lojaonline.pagamento;

public class CartaoCredito implements MetodoPagamento{

  @Override
  public void processarPagamento(double valor) {
    System.out.println("Processando pagamento via Cartão de Crédito no valor de: R$" + valor);

  }
}
