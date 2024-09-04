package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TarefaSemanalTest {

    @Test
    void deveExecutarTarefaSemanal() {
        Tarefa tarefa = new TarefaSemanal("Reunião de equipe");
        tarefa.executar();
        // Verifica se a instância foi criada e o método executar não gerou exceções
        assertNotNull(tarefa);
    }

}