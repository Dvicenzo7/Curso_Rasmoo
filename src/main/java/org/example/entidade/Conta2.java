package org.example.entidade;


//Trabalhando com classe abstrata, tive que criar a Conta2, pois nao pode instanciar quando a classe e abstrata
public abstract class Conta2 {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo = 0.0;

    //Atributo pertinente a classe e nao ao objeto
    private static int total;

    //Construtor Vazio
    public Conta2(){
    }

    //Construtr com parametros
    public Conta2(Cliente cliente, int numero, int agencia){
        this.titular = cliente;
        this.numero = numero;
        this.agencia = agencia;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }


    public boolean saque (double valor){
        if(saldo >= valor){
            saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    public void transferir(double valor, Conta2 destino){
        boolean conseguiuSacar = this.saque(valor);

        if(conseguiuSacar){
            destino.depositar(valor);
        }
    }

    public abstract void gerarExtrato();

    public static int getTotal() {
        return total;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
