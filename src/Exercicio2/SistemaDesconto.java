package Exercicio2;

class SistemaDesconto {
    public void aplicarDesconto(double valorOriginal, CalculadorDesconto calculadora) {
        double desconto = calculadora.calcular(valorOriginal);
        double valorFinal = valorOriginal - desconto;

        System.out.println("Valor original: R$ " + String.format("%.2f", valorOriginal));
        System.out.println("Tipo: R$ " + calculadora.getTipo());
        System.out.println("Desconto: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor final: R$ " + String.format("%.2f", valorFinal));
        System.out.println("Economia: R$ " + String.format("%.1f", (desconto/valorOriginal) * 100) + "%");
        System.out.println("-".repeat(50));
    }
}
