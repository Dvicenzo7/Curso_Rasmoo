package org.example.entidade;

public class ContaCorrente extends Conta2 {

    public ContaCorrente(Cliente cliente, int numero, int agencia) {
        super(cliente, numero, agencia);
    }

    //Implementando uma logica nova, atraves do Polimorfismo
    @Override
    public boolean saque(double valor) {
        double novoValor = valor + 2;
        return super.saque(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando Extrato conta Corrente");
    }
}
