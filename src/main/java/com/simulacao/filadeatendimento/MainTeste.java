package com.simulacao.filadeatendimento;

public class MainTeste {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Cleber");
        minhaFila.enqueue("Rosa");
        minhaFila.enqueue("Joao da Silva");
        minhaFila.enqueue("José");

        System.out.println(minhaFila);

    }
}
