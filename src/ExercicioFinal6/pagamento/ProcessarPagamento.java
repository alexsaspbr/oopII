package ExercicioFinal6.pagamento;

public class ProcessarPagamento<T extends MetodoPagamento> {
    T metodoPagamento;

    public ProcessarPagamento(T metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


    public void processar(double valor) {
        metodoPagamento.processarPagamento(valor);
    }
}
