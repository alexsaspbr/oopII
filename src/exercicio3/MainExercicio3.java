package exercicio3;

public class MainExercicio3 {

    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento pix = new Pix();

        cartaoCredito.processarPagamento(150.0);
        cartaoCredito.processarPagamento(-50.0);

        pix.processarPagamento(200.0);
        pix.processarPagamento(0.0);
    }
}
