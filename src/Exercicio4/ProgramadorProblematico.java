package Exercicio4;

class ProgramadorProblematico implements TrabalhadorProblemático {
    @Override
    public void trabalhar() {
        System.out.println("Programador desenvolvendo Software");
    }

    @Override
    public void estudar() {
        System.out.println("Programador estudando novas tecnologias");
    }

    @Override
    public void programar() {
        System.out.println("Programador codificando");
    }

    @Override
    public void ensinar() {
         throw new UnsupportedOperationException ("Este programador não ensina");
    }
}
