package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.ContaCorrente;
import org.example.entidade.ContaPoupanca;

public class TesteAbstract {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Daniel", "123456789");
        ContaPoupanca cp = new ContaPoupanca(cliente, 4001, 5000);
        ContaCorrente cc = new ContaCorrente(cliente, 4000, 5000);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
