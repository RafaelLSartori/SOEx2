package controller;

public class Exercicio2 {
    public Exercicio2(){
        super();
    }

    public void exDois(String frase){
        String[] vetorPalavras = frase.split(";");
        int tamanho = vetorPalavras.length;
        for (String palavra : vetorPalavras){
            System.out.println(palavra);
        }
        System.out.println("A frase tem "+ tamanho + " palavras.");
    }
};
