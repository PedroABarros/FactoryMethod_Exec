package org.example;

public class ProjetoFactoryMethod {
    public static void main(String[] args) {
        Arquivo arquivoImpressora = new Arquivo("impressora");
        arquivoImpressora.setConteudo("Texto para impressão em papel");
        arquivoImpressora.imprimir();

        Arquivo arquivoTela = new Arquivo("tela");
        arquivoTela.setConteudo("Texto para exibição na tela");
        arquivoTela.imprimir();

        Arquivo arquivoInvalido = new Arquivo("scanner");
        arquivoInvalido.setConteudo("Texto para dispositivo desconhecido");
        arquivoInvalido.imprimir();
    }
}

