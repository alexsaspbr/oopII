package Exercicio3;

public class ExercicioLSP {
    public static void main(String[] args) {
        DemonstradorProblema.demonstrarProblema();

        demonstrarSolucoes();

        analisarLSP();
    }

    private static void demonstrarSolucoes() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SOLUÇOES EM CONFORMIDADE COM O LSP");
        System.out.println("=".repeat(60));

        System.out.println("\n--- Solução 1: Classes Indepedentes ---");
        Forma[] formas = {
                new RetanguloLSP(4,6),
                new QuadradoLSP(5),
                new RetanguloLSP(3,8)
        };

        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.println("Perimetro: " + forma.perimetro());
            System.out.println("=".repeat(30));
        }

        System.out.println("\n--- Solução 2: Objetos Imutáveis ---");
        FormaImutavel ret = new RetanguloImutavel(4,6);
        FormaImutavel quad = new QuadradoImutavel(5);

        System.out.println("Original: " + ret);
        RetanguloImutavel novoRet = ((RetanguloImutavel) ret).comLargura(8);
        System.out.println("Novo retângulo: " + novoRet);

        System.out.println("Original: " + quad);
        QuadradoImutavel novoQuad = ((QuadradoImutavel) quad).comLado(7);
        System.out.println("Novo quadrado: " + novoQuad);
    }

    private static void analisarLSP() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ANÁLISE DO PRINCÍPIO LSP");
        System.out.println("=".repeat(60));

        System.out.println("\nPROBLEMAS NA IMPLEMENTAÇÃO INICIAL:");
        System.out.println("* Quebra de invariantes: Quadrado modifica comportamentos dos setters");
        System.out.println("* Comportamento Inesperado: Alterar uma dimensão afeta ambas");
        System.out.println("* Violação de Contratos: Código que espera Retângulo falha");

        System.out.println("\n SOLUÇÕES IMPLEMENTADAS:");
        System.out.println("* Classes independentes: Evita problemas de herança");
        System.out.println("* Objetos Imutáveis: Elimina problemas de estado");
        System.out.println("* Interfaces Claras: Contratos bem definidos");

        System.out.println("\nLSP RESPEITADO:");
        System.out.println("Substituibilidade mantida");
        System.out.println("Comportamento previsível");
        System.out.println("Contratos preservados");
        System.out.println("Polimorfismo funcional");

        System.out.println("\n--- Teste de conformidade LSP ---");
        testeLSP();
    }

    private static void testeLSP() {
        Forma[] formas = {
                new RetanguloLSP(4,6),
                new QuadradoLSP(4)
        };

        double areaTotal = 0;
        for (Forma forma : formas) {
            areaTotal += forma.area();
            System.out.println("Processando: " + forma);
        }

        System.out.printf("Área Total: %.1f%n", areaTotal);
        System.out.println("Polimorfismo funcionando corretamente!");
    }
}
