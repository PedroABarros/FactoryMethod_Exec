package org.example;

public class FabricaAgendadorSemanal implements FabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorSemanal();
    }
}
