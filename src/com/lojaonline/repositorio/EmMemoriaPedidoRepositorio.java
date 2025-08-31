package com.lojaonline.repositorio;

import com.lojaonline.pedido.Pedido;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

// Implementação simples para rodar e testar sem BD/JPA.
public class EmMemoriaPedidoRepositorio implements PedidoRepositorio {
    private final Map<Long, Pedido> store = new ConcurrentHashMap<>();
    private long seq = 0L;

    @Override
    public void salvar(Pedido pedido) {
        if (pedido.getId() == null) {
            seq++;
            pedido.setId(seq);
        }
        store.put(pedido.getId(), pedido);
    }

    @Override
    public Optional<Pedido> buscarPorId(long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<Pedido> buscarPorStatus(String status) {
        return store.values().stream()
                .filter(p -> p.getStatus().name().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}
