package exemplo.desafio.model;

import exemplo.desafio.interfaces.MetodoEnvio;

public class Sedex implements MetodoEnvio {

    @Override
    public double calcularCustoEnvio(Pedido pedido) {
        double pesoTotal = 0;
        for (Item item : pedido.getItens()) {
            pesoTotal += item.getPeso() * item.getQuantidade();
        }
        // Exemplo simples de cálculo de frete
        return pesoTotal * 2.5;
    }
}
