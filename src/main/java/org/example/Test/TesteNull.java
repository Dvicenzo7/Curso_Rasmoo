package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.Conta;

public class TesteNull {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta.getSaldo());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());


        if(conta.getTitular() == null) {
            conta.setTitular(new Cliente());
        }

        System.out.println(conta.getTitular()); //Vai dar Null, se nao instanciar o objeto org.example.entidade.Cliente vai dar nullpointer


        conta.getTitular().setNome("Daniel Vicenzo");

        System.out.println("O nome do titular da conta é: " + conta.getTitular().getNome());
    }
}
