package com.lojaonline.repositorio;

import java.util.List;

public interface Repositorio {

  public void salvar(Object obj);

  public void atualizar(Object obj);

  public void deletar(Object obj);

  public Object buscarPorId(int id);

  public List<Object> buscarTodos();

}
