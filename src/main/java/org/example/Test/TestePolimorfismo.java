package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.ContaCorrente;
import org.example.entidade.ContaPoupanca;

public class TestePolimorfismo {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Daniel", "123456789");
        ContaPoupanca cp = new ContaPoupanca(cliente, 4001, 5000);
        ContaCorrente cc = new ContaCorrente(cliente, 4000, 5000);

        cc.depositar(1000);
        cp.depositar(10000);

        cc.saque(100);
        cp.saque(1000);

        cp.transferir(500, cc);
        cc.transferir(100, cp);

        System.out.println("O saldo da CC: " + cc.getSaldo());
        System.out.println("O saldo da CP: " + cp.getSaldo());

        //toString serve para apresentar os atributos que colocamos no ToString
        System.out.println(cc);
        System.out.println(cp);
    }
}
