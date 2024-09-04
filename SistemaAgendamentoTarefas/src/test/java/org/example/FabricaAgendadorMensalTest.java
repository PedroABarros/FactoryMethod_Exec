package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaAgendadorMensalTest {

    @Test
    void deveCriarAgendadorMensal() {
        IFabricaAgendador fabrica = new FabricaAgendadorMensal();
        Agendador agendador = fabrica.criarAgendador();
        assertTrue(agendador instanceof AgendadorMensal);
    }

}