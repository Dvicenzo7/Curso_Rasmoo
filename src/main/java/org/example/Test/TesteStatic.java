package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.Conta;

public class TesteStatic {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Daniel", "123456789");

        Conta conta = new Conta(cliente, 4000, 1000);
        Conta conta2 = new Conta(cliente, 4001, 1000);

        System.out.println("Total de contas criadas: " + Conta.getTotal());
    }
}
