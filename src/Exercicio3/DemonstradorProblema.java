package Exercicio3;

public class DemonstradorProblema {
    public static void demonstrarProblema() {
        System.out.println("=".repeat(60));
        System.out.println("DEMONSTRAÇÃO DO PROBLEMA - VIOLAÇAO DO LSP");
        System.out.println("=".repeat(60));

        System.out.println("\n --- Testando comportamento inconsistente ---");

        System.out.println("\n1. Testando com Retângulo normal:");
        Retangulo ret = new Retangulo(3, 4);
        testarComportamento(ret);

        System.out.println("\n2. Testando com Quadrado (Violação do LSP):");
        Retangulo quad = new QuadradoProblematico(3);
        testarComportamento(quad);

        System.out.println("\n PROBLEMA: O nosso código produz comportamentos diferentes!");
        System.out.println("Isso viola o Princípio da Substituição de Liskov.");
    }

    private static void testarComportamento(Retangulo retangulo) {
        System.out.println("Estado inicial: " + retangulo);

        retangulo.setAltura(10);
        System.out.println("Após setLargura(10): " + retangulo);

        retangulo.setAltura(5);
        System.out.println("Após setAltura(5): " + retangulo);

        if (retangulo.getLargura() != 10 || retangulo.getAltura() != 5) {
            System.out.println("VIOLAÇÃO!: Comportamento inesperado detectado!");
        }
    }
}
