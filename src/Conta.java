import java.util.Date;

public abstract class Conta implements IConta{

    private static final  int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL=1;

    protected int agencia, numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        cliente=cliente;
    }


    public int getAgencia() {
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo=-valor;
    }

    @Override
    public void depositar(double valor) {
        saldo=+valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void boletos(double valor, int parcelas, Conta contaDestino,
                        Date vencimento, double multa, String nome, int parcelasPagas){
        System.out.println("Parcelas totais: "+ parcelas);

    }

    protected void infosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.printf("Agência: ", + agencia);
        System.out.println("Numero: "+ numero);
        System.out.println("Saldo: " + saldo);
    }

}
