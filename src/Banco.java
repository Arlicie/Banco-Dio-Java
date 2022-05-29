import java.util.List;

public class Banco {
    //o banco é composto por uma lista de contas
    private String nome;
    private List<Conta> contas;
    private List<Conta> boletos;

    String getNome(){
        return nome;
    }
    void setNome(String nome){
        nome=nome;
    }
}
