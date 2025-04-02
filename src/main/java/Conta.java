public class Conta {

    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo = 0.0;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
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

    void transferir(double valor, Conta destino){
         boolean conseguiuSacar = this.saque(valor);

         if(conseguiuSacar){
             destino.depositar(valor);
         }
    }
}
