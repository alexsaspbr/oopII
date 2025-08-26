package exercicio;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Notificacao> canaisSelecionados = new ArrayList<>();

    System.out.println("Escolha os canais de notificação desejados:");
    System.out.println("1 - Email");
    System.out.println("2 - SMS");
    System.out.println("3 - Push");
    System.out.println("Digite os números separados por vírgula (ex: 1,3):");

    String entrada = scanner.nextLine();
    String[] opcoes = entrada.split(",");

    for (String opcao : opcoes) {
      switch (opcao.trim ()) {
        case "1":
          canaisSelecionados.add(new EmailNotificacao());
          break;
        case "2":
          canaisSelecionados.add(new SmsNotificacao());
          break ;
        case "3":
          canaisSelecionados.add(new PushNotificacao());
          break;
        default:
          System.out.println("Opção inválida: " + opcao);
      }
    }

    GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisSelecionados);

    System.out.println("Digite a mensagem para enviar:");
    String mensagem = scanner.nextLine();

    gerenciador.notificarTodos(mensagem);
  }
}
