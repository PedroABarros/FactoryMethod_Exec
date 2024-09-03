package org.example;

public class FabricaAgendadorDiario implements FabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorDiario();
    }
}
