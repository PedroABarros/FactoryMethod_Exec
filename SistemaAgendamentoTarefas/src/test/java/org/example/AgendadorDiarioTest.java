package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendadorDiarioTest {
    @Test
    void deveCriarTarefaDiaria() {
        Agendador agendador = new AgendadorDiario();
        Tarefa tarefa = agendador.criarTarefa("Ir à academia");
        assertTrue(tarefa instanceof TarefaDiaria);
    }
}