package org.example;

public class TarefaMensal extends Tarefa {
    public TarefaMensal(String descricao) {
        super(descricao);
    }

    @Override
    public void executar() {
        System.out.println("Executando tarefa mensal: " + descricao);
    }
}
