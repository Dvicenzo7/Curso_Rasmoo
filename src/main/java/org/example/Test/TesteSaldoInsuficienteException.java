package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.Conta;

public class TesteSaldoInsuficienteException {
    public static void main(String[] args) {

        //Testando a exception personalizada

        Cliente cliente = new Cliente("Daniel", "00000000000");
        Conta conta = new Conta(cliente, 40000, 4000);
        conta.depositar(1000);
        conta.saque(20000);
    }
}
