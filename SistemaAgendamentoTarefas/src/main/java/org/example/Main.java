package org.example;

public class Main {
    public static void main(String[] args) {
        FabricaAgendador fabrica = new FabricaAgendadorDiario();
        Agendador agendador = fabrica.criarAgendador();
        agendador.agendarTarefa("Ir à academia");

        fabrica = new FabricaAgendadorSemanal();
        agendador = fabrica.criarAgendador();
        agendador.agendarTarefa("Reunião de equipe");

        fabrica = new FabricaAgendadorMensal();
        agendador = fabrica.criarAgendador();
        agendador.agendarTarefa("Revisar orçamento");
    }
}
