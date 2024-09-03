package org.example;

public class FabricaAgendadorMensal implements FabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorMensal();
    }
}
