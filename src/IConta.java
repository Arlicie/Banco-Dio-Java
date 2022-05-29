import java.util.Date;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);
    void transferir(double valor, Conta contaDestino);

    void boletos(double valor, int parcelas, Conta contaDestino,
                 Date vencimento, double multa, String nome, int parcelasPagas);


    void imprimirExtrato();


    void boletos(double valor, int parcelas, Conta contaDestino,
                 Date vencimento, double multa, String nome);
}
