package org.example;

public class TarefaDiaria extends Tarefa {
    public TarefaDiaria(String descricao) {
        super(descricao);
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa diária: " + descricao);
    }
}
