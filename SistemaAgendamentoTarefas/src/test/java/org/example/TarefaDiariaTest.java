package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaDiariaTest {
    @Test
    void deveExecutarTarefaDiaria() {
        Tarefa tarefa = new TarefaDiaria("Ir à academia");
        tarefa.executar();
        assertNotNull(tarefa);
    }

}