public class TestaMetodoReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);
        primeiraConta.transferir(500, segundaConta);
    }
}
