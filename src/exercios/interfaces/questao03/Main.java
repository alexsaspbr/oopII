package exercios.interfaces.questao03;

//### **3. Interface com `default` e `static`**
//Crie uma interface `Pagamento` com o método `processarPagamento(double valor)`.
//        - Adicione um método `default gerarRecibo(double valor)` que imprime um recibo.
//        - Adicione um método `static validarValor(double valor)` que verifica se o valor é positivo.
//Implemente em `CartaoCredito` e `Pix`.

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito();
        Pix pix = new Pix();

        double valorPagamento = 100.0;

        // Processar pagamento com cartão de crédito
        double valorComJuros = cartao.processarPagamento(valorPagamento);
        System.out.println(cartao.gerarRecibo(valorComJuros));

        // Processar pagamento via Pix
        double valorPix = pix.processarPagamento(valorPagamento);
        System.out.println(pix.gerarRecibo(valorPix));

        // Validar valores
        System.out.println("Valor válido (50.0): " + Pagamento.validarValor(50.0)); // true
        System.out.println("Valor válido (-10.0): " + Pagamento.validarValor(-10.0)); // false
    }
}
