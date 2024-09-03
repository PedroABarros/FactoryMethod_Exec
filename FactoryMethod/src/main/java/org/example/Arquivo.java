package org.example;

public class Arquivo {

    private String conteudo;
    private Dispositivo dispositivo;

    public Arquivo(String nomeDispositivo) {
        try {
            this.dispositivo = DispositivoFactory.criarDispositivo(nomeDispositivo);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro ao criar dispositivo: " + ex.getMessage());
            this.dispositivo = null;
        }
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void imprimir() {
        if (this.dispositivo != null) {
            this.dispositivo.imprimir(conteudo);
        } else {
            System.out.println("Dispositivo não disponível.");
        }
    }
}