package org.example.Test;

import org.example.entidade.Cliente;
import org.example.entidade.Conta;

public class TesteException {
    public static void main(String[] args) {

        try {
            int resultado = 5 / 2;
            System.out.println("Resultado da divisao é: " + resultado);

            Cliente cliente = new Cliente("Daniel", "00000000000");
            Conta conta = new Conta(cliente, 40000, 4000);
            conta.depositar(1000);
            conta.saque(20000);

            System.out.println("O saldo da minha conta é: " + conta.getSaldo());

            //forcando a exceção
//            ArithmeticException arithmeticException = new ArithmeticException("Deu ruim!!");
//            throw arithmeticException;

        }catch (ArithmeticException | NullPointerException e){
            System.out.println("o motivo do erro foi: " + e.getMessage());
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Esse bloco sempre sera executado");
        }
    }
}
