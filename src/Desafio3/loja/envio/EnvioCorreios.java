package Desafio3.loja.envio;

import Desafio3.loja.interfaces.CalculadorFrete;
import Desafio3.loja.interfaces.ServicoEnvio;
import Desafio3.loja.model.Pedido;

public class EnvioCorreios implements ServicoEnvio, CalculadorFrete {
    @Override
    public boolean enviarPedido(Pedido pedido) {
        System.out.println("Enviando pedido " + pedido.getId() + " via Correios");
        return true;
    }

    @Override
    public double calcularFrete(String cep)  {
        return 15.0;
    }
}
