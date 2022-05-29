import java.util.Date;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato Conta===");
        infosComuns();
    }

    @Override
    public void boletos(double valor, int parcelas, Conta contaDestino, Date vencimento, double multa, String nome) {

    }
}
