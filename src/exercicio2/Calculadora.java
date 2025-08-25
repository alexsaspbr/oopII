package exercicio2;

public class Calculadora implements OperacoesMatematicas {

    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }

        return a / b;
    }
}
