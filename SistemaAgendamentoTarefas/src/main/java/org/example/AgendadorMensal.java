package org.example;

public class AgendadorMensal extends Agendador {
    @Override
    public Tarefa criarTarefa(String descricao) {
        return new TarefaMensal(descricao);
    }
}
