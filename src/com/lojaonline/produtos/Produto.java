package com.lojaonline.produtos;

import java.util.Objects;

// SRP: representa um produto.
public class Produto {
    private final String nome;
    private final double preco;

    public Produto(String nome, double preco) {
        this.nome = Objects.requireNonNull(nome, "nome obrigatório");
        if (preco < 0) throw new IllegalArgumentException("Preço não pode ser negativo");
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
