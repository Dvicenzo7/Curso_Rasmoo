package org.example.entidade;

public class ContaPoupanca extends Conta{

    //Trabalhando com herança e atribuindo tudo da classe Conta atributos e metodos
    public ContaPoupanca(Cliente cliente, int numero, int agencia){
        super(cliente, numero, agencia);
    }

}
