package com.simulacao.filadeatendimento;

import java.util.Scanner;

/*
* Classe Main: Classe interativa usada para executar as classes do programa e seus métodos
*
 */
public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        Scanner entradaTxtSimples = new Scanner(System.in);
        Scanner entradaTxt = new Scanner(System.in);
        Scanner entradaInt = new Scanner(System.in);

        System.out.println("\n--------------------------------------\n");
        System.out.println("            Bem vindo!!");
        System.out.println("\n--------------------------------------\n");
        String sair = "nao",nome,addNovo;
        int opcoes;
        do {
            System.out.println("Selecione o que deseja fazer:");
            System.out.println("[1] mostrar fila atual\n[2] mostrar proximo a ser atendido\n[3] adicionar novo cliente\n[4] remover um cliente\n[5] sair");
            opcoes = entradaInt.nextInt();
            System.out.println("\n--------------------------------------\n");
            switch (opcoes) {
                case 1:
                    System.out.println("Fila atual:");
                    System.out.println(fila);
                    if (fila.isEmpty()) {
                        System.out.println("\nA fila está vazia no momento. Deseja adicionar novo cliente à fila? (sim / nao)");
                        addNovo = entradaTxtSimples.next();
                        System.out.println("");

                        if (addNovo.equalsIgnoreCase("sim") || addNovo.equalsIgnoreCase("s")) {
                            System.out.println("Digite o nome do cliente que sera adicionado:");
                            nome = entradaTxt.nextLine();
                            fila.enqueue(nome);
                            System.out.println("");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Proximo cliente da fila:");
                    if (!fila.isEmpty()) {
                        fila.first();
                    } else {
                        System.out.println(fila);
                        System.out.println("\nA fila está vazia no momento. Deseja adicionar novo cliente à fila? (sim / nao)");
                        addNovo = entradaTxtSimples.next();
                        System.out.println("");

                        if (addNovo.equalsIgnoreCase("sim") || addNovo.equalsIgnoreCase("s")) {
                            System.out.println("Digite o nome do cliente que sera adicionado:");
                            nome = entradaTxt.nextLine();
                            fila.enqueue(nome);
                            System.out.println("");
                        }
                    }

                    break;
                case 3:
                    System.out.println("Digite o nome do cliente que sera adicionado:");
                    nome = entradaTxt.nextLine();
                    fila.enqueue(nome);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Chamando cliente para atendimento.");
                    fila.first();
                    fila.dequeue();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Tem certeza que deseja sair? (sim / nao)");
                    sair = entradaTxtSimples.next();
                    break;
                default:
                    System.out.println("A opção selecionada foi inválida tente novamente.");
                    System.out.println("");
                    break;
            }
        } while (sair.equalsIgnoreCase("nao") || sair.equalsIgnoreCase("n"));
    }
}
