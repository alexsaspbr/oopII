package exercios.interfaces.questao02;

//### **2. Interface com Constantes**
//Crie uma interface `OperacoesMatematicas` que define constantes para `PI` e `E`,
//além dos métodos `somar`, `subtrair`, `multiplicar` e `dividir`.
//Implemente essa interface na classe `Calculadora`.

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + calc.somar(a, b));               // Saída: 15.0
        System.out.println("Subtração: " + calc.subtrair(a, b));       // Saída: 5.0
        System.out.println("Multiplicação: " + calc.multiplicar(a, b)); // Saída: 50.0
        System.out.println("Divisão: " + calc.dividir(a, b));           // Saída: 2.0

        System.out.println("Constante PI: " + OperacoesMatematicas.PI); // Saída: 3.14159
        System.out.println("Constante E: " + OperacoesMatematicas.E);   // Saída: 2.71828

        // Adicional: Criando calculo com as constantes
        double areaCirculo = OperacoesMatematicas.PI * calc.multiplicar(a, a);
        System.out.println("Área do círculo com raio " + a + ": " + areaCirculo); // Saída: Área do círculo com raio 10: 314.159

        double crescimentoExponencial = calc.multiplicar(OperacoesMatematicas.E, b);
        System.out.println("Crescimento exponencial com E e " + b + ": " + crescimentoExponencial); // Saída: Crescimento exponencial com E e 5: 13.5914
    }
}
