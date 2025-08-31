package com.lojaonline.envio;

public class GerenciadorEnvio implements EnvioPort {
    @Override
    public void enviarPara(String endereco) {
        System.out.println("Enviando pedido para: " + endereco);
    }
}
