package Exercicio4;

class GerenciadorTrabalho {
    public static void organizarTrabalho(Trabalhador[] trabalhadores) {
        System.out.println("--- Organizando trabalho para todos ---");
        for (Trabalhador trabalhador : trabalhadores) {
            System.out.print(trabalhador + " --> ");
            trabalhador.trabalhar();
        }
    }

    public static void organizarEstudos(Estudante[] estudantes) {
        System.out.println("\n--- Organizando estudos ---");
        for (Estudante estudante : estudantes) {
            estudante.estudar();
        }
    }

    public static void organizarProgramacao(Programador[] programadores) {
        System.out.println("\n--- Organizando programação ---");
        for (Programador programador : programadores) {
            programador.programar();
        }
    }

    public static void organizarEnsino(Professor[] professors) {
        System.out.println("\n--- Organizando ensino ---");
        for (Professor professor : professors) {
            professor.ensinar();
        }

    }
}
