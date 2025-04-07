package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.ContaCorrente;
import org.example.entidade.ContaPoupanca;

public class TesteHeranca {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Daniel", "123456789");

        ContaCorrente cc = new ContaCorrente(cliente, 4000, 5000);

        cc.depositar(1000);
        cc.saque(233.76);

        ContaPoupanca cp = new ContaPoupanca(cliente, 4001, 5000);

        cc.transferir(500, cp);
        cp.depositar(5000);

        System.out.println("O saldo da CC: " + cc.getSaldo());
        System.out.println("O saldo da CP: " + cp.getSaldo());


    }
}
