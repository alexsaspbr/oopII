package exercicio;

import java.util.List;

public class GerenciadorDeNotificacoes {
  private List<Notificacao> canais;

  public GerenciadorDeNotificacoes(List<Notificacao> canais) {
    this.canais = canais;
  }

  public void notificarTodos(String mensagem) {
    for (Notificacao canal : canais) {

      canal.enviar(mensagem )  ;
    }
  }
}