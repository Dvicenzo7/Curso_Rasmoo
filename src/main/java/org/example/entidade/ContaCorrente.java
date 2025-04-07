package org.example.entidade;

public class ContaCorrente extends Conta {

    //Trabalhando com herança e atribuindo tudo da classe Conta atributos e metodos
    public ContaCorrente(Cliente cliente, int numero, int agencia){
        super(cliente, numero, agencia);
    }
}
