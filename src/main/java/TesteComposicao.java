public class TesteComposicao {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Daniel");
        cliente.setCpf("49611139802");
        cliente.setProfissao("Programador");
        cliente.setSalario(5000);

        Conta conta = new Conta();
        conta.setTitular(cliente);

        System.out.println(conta.getTitular().getNome());
    }
}
