package org.example;

public class TarefaSemanal extends Tarefa {
    public TarefaSemanal(String descricao) {
        super(descricao);
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa semanal: " + descricao);
    }
}
