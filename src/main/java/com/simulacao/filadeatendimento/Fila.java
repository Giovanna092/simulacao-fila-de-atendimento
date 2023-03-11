package com.simulacao.filadeatendimento;

/*
* Classe Fila: usada para criar uma fila utilizando a referencia de memória como meio para acessar outras classes
*
*/
public class Fila<T> {

    private Cliente<T> ultimoClienteFila;

    private int senhaAtendimento;


    public Fila() {
        ultimoClienteFila=null;
        senhaAtendimento=0;
    }

    public int getSenhaAtendimento() {
        return senhaAtendimento;
    }


    //adiciona novo cliente ao final da fila
    public void enqueue(T nome) {
        Cliente novoCliente = new Cliente(nome);
        novoCliente.setProximoCliente(ultimoClienteFila);
        ultimoClienteFila = novoCliente;
        senhaAtendimento++;
        novoCliente.setSenha(senhaAtendimento);
    }


    //remove o primeiro Cliente da fila
    public T dequeue() {
        if (!this.isEmpty()) {
            Cliente primeiroCliente = ultimoClienteFila;
            Cliente clienteAux = ultimoClienteFila;

            //percorre do ultimo cliente até o primeiro que será removido
            while (true) {
                if (primeiroCliente.getProximoCliente() != null) {
                    clienteAux = primeiroCliente;
                    primeiroCliente = primeiroCliente.getProximoCliente();
                } else {
                    //se este if so é verdadeiro caso a fila tenha apenas um Cliente
                    if (clienteAux.getProximoCliente() == null && primeiroCliente.getProximoCliente() == null) {
                        ultimoClienteFila = null;
                    }

                    //ClienteAux se torna o primeiro Cliente
                    clienteAux.setProximoCliente(null);
                    break;
                }
            }
        }
        return null;
    }


    //mostra o primeiro cliente na fila ou proximo a ser atendido
    public void first() {
        if (!isEmpty()) {
            Cliente primeiroCliente = ultimoClienteFila;
            while (true) {
                if (primeiroCliente.getProximoCliente() != null) {
                    //percorre do ultimo na fila até o primeiro
                    primeiroCliente = primeiroCliente.getProximoCliente();
                } else {
                    break;
                }
            }
            System.out.println(primeiroCliente);
        }
    }


    public boolean isEmpty() { return ultimoClienteFila == null ? true : false; }


    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Fila{ }";
        }
        String str = "";
        Cliente clienteAux = ultimoClienteFila;

        if (ultimoClienteFila != null) {
            //estrutura para percorrer toda a lista e imprimir seus dados começando pelo ultimo e indo até o primeiro
            while (true) {
                str += "Cliente{" +
                        "nome do cliente: " + clienteAux.getNomeCliente() +
                        ", senha para atendiment: " + clienteAux.getSenha() +
                        "}---> ";
                if (clienteAux.getProximoCliente() != null) {
                    clienteAux = clienteAux.getProximoCliente();
                } else {
                    str += "null";
                    break;
                }
            }
        } else {
            str += "null";
        }
        return str;
    }
}
