package com.simulacao.filadeatendimento;

public class MainTeste {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Cleber");
        minhaFila.enqueue("Rosa");
        minhaFila.enqueue("Joao da Silva");
        minhaFila.enqueue("José");
        minhaFila.enqueue("maria");
        minhaFila.enqueue("Rosana");
        minhaFila.enqueue("Cleide");
        minhaFila.enqueue("Josisvaldo");
        minhaFila.enqueue("Ednilson");

        System.out.println(minhaFila);
        minhaFila.first();

        System.out.println("\nProximo a ser atendido: ");
        minhaFila.dequeue();
        //System.out.println(minhaFila);

    }
}
