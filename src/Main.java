public class Main {
    public static void main(String[] args) {
        Cliente victoria = new Cliente();
        victoria.setNome("Victoria");

        Conta cc = new ContaCorrente(victoria);
        Conta cp = new ContaPoupanca(victoria);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
