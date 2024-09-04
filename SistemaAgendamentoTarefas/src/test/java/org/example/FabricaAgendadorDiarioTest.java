package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaAgendadorDiarioTest {

    @Test
    void deveCriarAgendadorDiario() {
        IFabricaAgendador fabrica = new FabricaAgendadorDiario();
        Agendador agendador = fabrica.criarAgendador();
        assertTrue(agendador instanceof AgendadorDiario);
    }

}