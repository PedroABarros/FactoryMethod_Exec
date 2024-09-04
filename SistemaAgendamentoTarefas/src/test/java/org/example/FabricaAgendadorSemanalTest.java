package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaAgendadorSemanalTest {

    @Test
    void deveCriarAgendadorSemanal() {
        IFabricaAgendador fabrica = new FabricaAgendadorSemanal();
        Agendador agendador = fabrica.criarAgendador();
        assertTrue(agendador instanceof AgendadorSemanal);
    }

}