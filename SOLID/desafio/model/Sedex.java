package desafio.model;

import desafio.interfaces.MetodoEnvio;

public class Sedex implements MetodoEnvio {

    @Override
    public double calcularCustoEnvio(Pedido pedido) {
        double custoTotal = 10.0; // Taxa base
        custoTotal += pedido.getPesoTotal() * 5.0; // R$5 por kg
        return custoTotal;
    }
}
