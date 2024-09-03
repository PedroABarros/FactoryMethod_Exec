package org.example;

public class AgendadorDiario extends Agendador {
    @Override
    public Tarefa criarTarefa(String descricao) {
        return new TarefaDiaria(descricao);
    }
}