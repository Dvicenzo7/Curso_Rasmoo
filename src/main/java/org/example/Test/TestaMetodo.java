package org.example.Test;

import org.example.entidade.Conta;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(1200);
        conta.depositar(500);

        System.out.println(conta.getSaldo());

        boolean saque = conta.saque(200);

        if (saque) {
            System.out.println("saque realizado");
        }else {
            System.out.println("Saque nao realizado");
        }
    }
}
