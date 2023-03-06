package com.simulacao.filadeatendimento;

/*
* Classe Fila: usada para criar uma fila utilizando a referencia de memória como meio para acessar outras classes
*
*/
public class Fila<T> {

    private Cliente<T> ultimoClienteFila;

    private int senhaAtendimento;


    public Fila() { }

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

    //mostra o primeiro cliente na fila ou proximo a ser atendido
    /*public T first() {
        if (!isEmpty()) {
            Cliente primeiroCliente = ultimoClienteFila;
            while (true) {
                if (primeiroCliente.getProximoCliente() != null) {
                    //percorre do ultimo na fila até o primeiro
                    primeiroCliente = primeiroCliente.getProximoCliente();
                } else {
                    return null;
                }
            }
            return (T) primeiroCliente;
        }
        return null;
    }*/

    public boolean isEmpty() { return ultimoClienteFila == null ? true : false; }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Fila{}";
        }
        String str = "";
        Cliente clAuxiliar = ultimoClienteFila;

        if (ultimoClienteFila != null) {
            //estrutura para percorrer toda a lista e imprimir seus dados começando pelo ultimo e indo até o primeiro
            while (true) {
                str += "Cliente{" +
                        "nome do cliente=" + clAuxiliar.getNomeCliente() +
                        ", senha para atendimento=" + clAuxiliar.getSenha() +
                        "}--->";
                if (clAuxiliar.getProximoCliente() != null) {
                    clAuxiliar = clAuxiliar.getProximoCliente();
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
