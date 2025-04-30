package org.example.exception;

//Criando Exception personalizada
public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String msg){
        super(msg);
    }

}
