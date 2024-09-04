package org.example;

public class FabricaAgendadorMensal implements IFabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorMensal();
    }
}
