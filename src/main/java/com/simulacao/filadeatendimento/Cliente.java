package com.simulacao.filadeatendimento;

/*
*** Classe Cliente: usado para identificar sua posição na lista atraves da senha
*** e é usado para acessar o cliente imediatamente à sua frente
 */

public class Cliente<T> {
    private T nomeCliente;
    private T senhaAtendimento;
    private Cliente<T> proximoCliente;

    public Cliente() {  }

    public Cliente(T nomeCliente, T senhaAtendimento) {
        this.nomeCliente = nomeCliente;
        this.senhaAtendimento = senhaAtendimento;
    }

    public T getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(T nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public T getSenhaAtendimento() {
        return senhaAtendimento;
    }

    public void setSenhaAtendimento(T senhaAtendimento) {
        this.senhaAtendimento = senhaAtendimento;
    }

    public Cliente<T> getProximoCliente() {
        return proximoCliente;
    }

    public void setProximoCliente(Cliente<T> proximoCliente) {
        this.proximoCliente = proximoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome do cliente=" + nomeCliente +
                ", senha para atendimento=" + senhaAtendimento +
                '}';
    }
}
