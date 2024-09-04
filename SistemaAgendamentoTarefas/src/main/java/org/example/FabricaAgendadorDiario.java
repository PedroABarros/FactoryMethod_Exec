package org.example;

public class FabricaAgendadorDiario implements IFabricaAgendador {
    @Override
    public Agendador criarAgendador() {
        return new AgendadorDiario();
    }
}
