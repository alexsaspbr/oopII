package Exercicio2;

class CalculadorDescontoViolaOCP {
    public double calcularDesconto(double valor, String tipoDesconto) {
        switch (tipoDesconto) {
            case "FIXO":
                return 10.0;
            case "PERCENTUAL":
                return valor * 0.05;
            case "PROGRESSIVO":
                if (valor > 500) return valor * 0.15;
                else if (valor > 200) return valor * 0.10;
                else return valor * 0.05;
            default:
                return 0.0;
        }
    }
}
