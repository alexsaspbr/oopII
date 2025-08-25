package exercios.interfaces.questao04;

//4. Polimorfismo com Interfaces
//Implemente um sistema de gerenciamento de arquivos com uma interface Armazenamento que define os métodos salvar(String dado) e ler().
//Crie implementações para:
//BancoDeDados (simula armazenamento em BD)
//ArquivoTexto (simula gravação em arquivo de texto)
//No programa principal, crie uma lista de Armazenamento e demonstre polimorfismo.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Armazenamento> armazenamentos = new ArrayList<>();

        armazenamentos.add(new BancoDeDados());
        armazenamentos.add(new ArquivoTexto());

        for (Armazenamento armazenamento : armazenamentos) {
            armazenamento.salvar("Dados de exemplo");
            armazenamento.ler();
            System.out.println("-----");
        }
    }
}
