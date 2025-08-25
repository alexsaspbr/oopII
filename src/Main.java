//import exemplo.ecommerce.Produto;
//import exemplo.imposto.ICMS;
//import exemplo.imposto.IOF;
//import exemplo.imposto.Imposto;
//import exemplo.imposto.ImpostoRecord;
//import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import desafioInterfacesJava.Exercicio1.Cachorro;
import desafioInterfacesJava.Exercicio1.Gato;
import desafioInterfacesJava.Exercicio2.Calculadora;
import desafioInterfacesJava.Exercicio3.CartaoCredito;
import desafioInterfacesJava.Exercicio3.Pagamento;
import desafioInterfacesJava.Exercicio3.Pix;
import desafioInterfacesJava.Exercicio4.Armazenamento;
import desafioInterfacesJava.Exercicio4.ArquivoTexto;
import desafioInterfacesJava.Exercicio4.BancoDeDados;
import desafioInterfacesJava.Exercicio5.*;

public class Main {
  public static void main(String[] args) {

    System.out.println("Exercicio1");
    Cachorro cachorro = new Cachorro();

    Gato gato = new Gato();

    gato.emitirSom();
    gato.mover();

    cachorro.emitirSom();
    cachorro.mover();


    System.out.println("Exercicio2");

    int a = 20;
    int b = 0;

    Calculadora calculadora = new Calculadora();

    System.out.println("somando:" + a + "+" + b + "=" + calculadora.somar(a, b));
    System.out.println("subtraindo:" + a + "-" + b + "=" + calculadora.subtrair(a, b));
    System.out.println("multiplicando:" + a + "*" + b + "=" + calculadora.multiplicar(a, b));

    try {
      double resultado = calculadora.dividir(10, 0);
      System.out.println("dividir:" + a + "-" + b + "%" + resultado);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Exercicio3");
    Pagamento pagamentoCartao = new CartaoCredito();
    Pagamento pagamentoPix = new Pix();

    // Testando pagamento com cartão de crédito
    pagamentoCartao.processarPagamento(150.0); // Pagamento válido
    pagamentoCartao.processarPagamento(-20.0);  // Pagamento inválido

    // Testando pagamento via Pix
    pagamentoPix.processarPagamento(75.0);      // Pagamento válido
    pagamentoPix.processarPagamento(0.0);       // Pagamento inválido

    //Exercicio 4
    List<Armazenamento> armazenamentos = new ArrayList<>();
    // Adicionando implementações de Armazenamento à lista
    armazenamentos.add(new BancoDeDados());
    armazenamentos.add(new ArquivoTexto());

    // Salvando dados em cada tipo de armazenamento
    for (Armazenamento armazenamento : armazenamentos) {
      armazenamento.salvar("Exemplo de dado");
    }

    // Lendo dados de cada tipo de armazenamento
    for (Armazenamento armazenamento : armazenamentos) {
      System.out.println(armazenamento.ler());
    }

    // Ex 5
    List<Notificacao> notificadores = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escolha os canais de notificação:");
    System.out.println("1. Email");
    System.out.println("2. SMS");
    System.out.println("3. Push");
    System.out.println("Digite os números dos canais desejados (separados por espaço):");

    String[] escolhas = scanner.nextLine().split(" ");
    for (String escolha : escolhas) {
      switch (escolha) {
        case "1":
          notificadores.add(new EmailNotificacao());
          break;
        case "2":
          notificadores.add(new SmsNotificacao());
          break;
        case "3":
          notificadores.add(new PushNotificacao());
          break;
        default:
          System.out.println("Escolha inválida: " + escolha);
      }
    }

    GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(notificadores);

    System.out.println("Digite a mensagem a ser enviada:");
    String mensagem = scanner.nextLine();

    gerenciador.notificarTodos(mensagem);
    scanner.close();
  }

}
