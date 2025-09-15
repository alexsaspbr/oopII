package Exercicio4;

class OperarioProblematico implements TrabalhadorProblemático {
    @Override
    public void trabalhar() {
        System.out.println("Operário trabalhando na fábrica ");
    }

    @Override
    public void estudar() {
        throw new UnsupportedOperationException("Operário não estuda durante o trabalho.");
    }

    @Override
    public void programar() {
        throw new UnsupportedOperationException("Operário não programa");
    }

    @Override
    public void ensinar() {
        throw new UnsupportedOperationException("Operário não ensina");
    }
}
