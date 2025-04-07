package org.example.Test;

import org.example.entidade.Conta;

public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(1525.40);
        conta.setAgencia(0525);
        conta.setNumero(123);



        System.out.println(conta);
    }
}
