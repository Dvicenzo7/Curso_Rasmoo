public class TesteReferencia {
    public static void main(String[] args) {
        Conta conta = new Conta();

        System.out.println(conta);

        Conta segundaConta = conta;

        System.out.println(segundaConta);

        conta.setSaldo(1000);

        System.out.println(conta.getSaldo());

        segundaConta.setSaldo(450);

        System.out.println(conta.getSaldo());

        if (conta == segundaConta){
            System.out.println("as duas variaveis apontam para o mesmo local");
        }else {
            System.out.println("são diferentes");
        }
    }
}
