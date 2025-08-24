package exercios;

public interface OperacoesMatematicas {
    static double PI = 3.14159;
    static double E = 2.71828;

    double somar(double a, double b);
    double subtrair(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b);
}

class Calculadora implements OperacoesMatematicas {

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
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        return a / b;
    }
}
