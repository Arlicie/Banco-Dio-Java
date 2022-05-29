import java.util.Date;

public class ContaCorrente extends Conta{
//ao extender da classe Conta, ela terá tudo o que a classe Conta tem
    public ContaCorrente(Cliente cliente){
        super(cliente);
    }
    @Override
        public void imprimirExtrato() {
            System.out.println("===Extrato Conta Corrente===");
            infosComuns();
    }

    @Override
    public void boletos(double valor, int parcelas, Conta contaDestino, Date vencimento, double multa, String nome) {

    }


}
