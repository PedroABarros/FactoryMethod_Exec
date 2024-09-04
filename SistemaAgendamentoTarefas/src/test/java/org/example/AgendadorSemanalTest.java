package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendadorSemanalTest {
    @Test
    void deveCriarTarefaSemanal() {
        Agendador agendador = new AgendadorSemanal();
        Tarefa tarefa = agendador.criarTarefa("Reunião de equipe");
        assertTrue(tarefa instanceof TarefaSemanal);
    }

}