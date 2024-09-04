package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaMensalTest {

    @Test
    void deveExecutarTarefaMensal() {
        Tarefa tarefa = new TarefaMensal("Revisar orçamento");
        tarefa.executar();
        assertNotNull(tarefa);
    }

}