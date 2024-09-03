package org.example;

public class AgendadorSemanal extends Agendador {
    @Override
    public Tarefa criarTarefa(String descricao) {
        return new TarefaSemanal(descricao);
    }
}
