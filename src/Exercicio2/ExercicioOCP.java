package Exercicio2;

public class ExercicioOCP {
    public static void main(String[] args) {
        System.out.println(" EXEMPLO VIOLANDO OCP:");
        System.out.println("=".repeat(50));

        CalculadorDescontoViolaOCP calculadorRuim = new CalculadorDescontoViolaOCP();
        double valor = 300.0;

        System.out.println("Para adicionar novo tipo de desconto, precisa modificar a classe existente!");
        System.out.println("Desconto Fixo: R$ " + calculadorRuim.calcularDesconto(valor, "FIXO"));
        System.out.println("Desconto Percentual: R$ " + calculadorRuim.calcularDesconto(valor, "PERCENTUAL"));

        System.out.println("\nAPLICANDO OCP:");
        System.out.println("=".repeat(50));

        SistemaDesconto sistema = new SistemaDesconto();
        double valorCompra = 300.0;

        System.out.println("Simulando Compra de: R$ " + valorCompra);
        System.out.println();

        sistema.aplicarDesconto(valorCompra, new DescontoFixo(15.0));

        sistema.aplicarDesconto(valorCompra, new DescontoPercentual(10));

        sistema.aplicarDesconto(valorCompra, new DescontoProgressivo());

        sistema.aplicarDesconto(valorCompra, new DescontoBlackFriday());

        sistema.aplicarDesconto(valorCompra, new DescontoPrimeiroCliente());

        sistema.aplicarDesconto(valorCompra, new DescontoFidelidade(150));

        System.out.println("SIMULANDO DIFERENTES CENÁRIOS:");

        double[] valoresCompra = {50.0, 150.0, 300, 350.0, 600.0};
        CalculadorDesconto descontoProgressivo = new DescontoProgressivo();

        for (double val : valoresCompra) {
            System.out.println("Compra R$ " + val + " -> Desconto: R$ " +
                             String.format("%.2f", descontoProgressivo.calcular(val)));
        }

        System.out.println("\n PRÓXIMAS EXTENSÕES POSSÍVEIS (sem modificar nada!):");
        System.out.println("- DescontoCupom");
        System.out.println("- DescontoPorCategoria");
        System.out.println("- DescontoIdoso");
        System.out.println("- DescontoEstudante");
        System.out.println("- DescontoLiquidacao");
    }
}
