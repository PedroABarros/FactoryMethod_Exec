package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendadorMensalTest {
    @Test
    void deveCriarTarefaMensal() {
        Agendador agendador = new AgendadorMensal();
        Tarefa tarefa = agendador.criarTarefa("Revisar orçamento");
        assertTrue(tarefa instanceof TarefaMensal);
    }

}