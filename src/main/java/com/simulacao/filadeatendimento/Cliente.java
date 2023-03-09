package com.simulacao.filadeatendimento;

/*
*** Classe Cliente: usado para identificar sua posição na lista atraves da senha
*** e é usado para acessar o cliente imediatamente à sua frente
 */

public class Cliente<T> {
    private T nomeCliente;
    private T senha;
    private Cliente<T> proximoCliente;

    public Cliente() {  }

    public Cliente(T nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public T getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(T nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public T getSenha() {
        return senha;
    }

    public void setSenha(T senha) {
        this.senha = senha;
    }

    public Cliente<T> getProximoCliente() {
        return proximoCliente;
    }

    public void setProximoCliente(Cliente<T> proximoCliente) {
        this.proximoCliente = proximoCliente;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + nomeCliente +
                ", Senha para atendimento: " + senha;
    }
}
