package org.example;

public class FabricaAgendadorSemanal implements IFabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorSemanal();
    }
}
