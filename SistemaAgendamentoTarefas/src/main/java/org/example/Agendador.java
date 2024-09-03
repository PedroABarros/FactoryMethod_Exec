package org.example;

public abstract class Agendador {
    public abstract Tarefa criarTarefa(String descricao);

    public void agendarTarefa(String descricao) {
        Tarefa tarefa = criarTarefa(descricao);
        tarefa.executar();
    }
}