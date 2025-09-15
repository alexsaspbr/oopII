package Exercicio4;

public class ExercicioISP {
    public static void main(String[] args) {
        demonstrarProblema();
        demonstrarSolucao();
        analisarISP();

    }

    private static void demonstrarProblema() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("PROBLEMA - VIOLAÇÃO DO ISP");
        System.out.println("=".repeat(60));

        System.out.println("\nProblema: Interface 'TrabalhadorProblematico' força implementações desnecessárias");

        try {
            OperarioProblematico operario = new OperarioProblematico();
            operario.trabalhar();
            operario.programar();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nISP Violado: Clientes forçados a depender de métodos que não usam!");
    }

    private static void demonstrarSolucao() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("SOLUÇÃO - CONFORMIDADE COM ISP");
        System.out.println("=".repeat(60));

        Operario operario = new Operario("João");
        Desenvolvedor dev = new Desenvolvedor("Maria");
        Estagiario estagiario = new Estagiario("Pedro");
        Techlead techlead = new Techlead("Ana");

        Trabalhador[] todosTrabalhadores = {operario, dev, estagiario, techlead};
        GerenciadorTrabalho.organizarTrabalho(todosTrabalhadores);

        Estudante[] estudantes = {dev, estagiario, techlead};
        GerenciadorTrabalho.organizarEstudos(estudantes);

        Programador[] programadores = {dev, techlead};
        GerenciadorTrabalho.organizarProgramacao(programadores);

        Professor[] professores = {techlead};
        GerenciadorTrabalho.organizarEnsino(professores);
    }

    private static void analisarISP() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("ANÁLISE DO ISP");
        System.out.println("=".repeat(60));

        System.out.println("\n Principio ISP:");
        System.out.println("\"Clientes não devem ser forçados a depender de interfaces que não usam\"");

        System.out.println("\nPROBLEMAS DA IMPLEMENTAÇÃO INICIAL:");
        System.out.println("* Interface muito grande (4 métodos)");
        System.out.println("* Classes forçadas a implementar métodos irrelevantes");
        System.out.println("* Acoplamento desnecessário");
        System.out.println("* Código frágil (exceções em runtime)");

        System.out.println("\nBENEFÍCIOS DA SOLUÇÃO ISP:");
        System.out.println("* Interfaces pequenas focadas");
        System.out.println("* Baixo acoplamento");
        System.out.println("* Alta coesão");
        System.out.println("* Flexibilidade na implementação");
        System.out.println("* Facilita manutenção e testes");

        System.out.println("\nISP APLICADO COM SUCESSO!");
    }
}
