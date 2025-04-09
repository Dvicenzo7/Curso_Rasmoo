package org.example.entidade;

public class ContaPoupanca extends Conta2{

    //Trabalhando com herança e atribuindo tudo da classe Conta atributos e metodos
    public ContaPoupanca(Cliente cliente, int numero, int agencia){
        super(cliente, numero, agencia);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando Extrato conta Poupança");
    }
}
