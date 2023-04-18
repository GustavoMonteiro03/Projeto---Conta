public class Conta {
    private final String titular;
    private final int numeroConta;
    private final double quantidade;

    // Construtor da classe
    public Conta(String titular, int numeroConta, double quantidade) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.quantidade = quantidade;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public String getTitular() {
        return titular;
    }

    public static Conta compararContas(Conta conta1,Conta conta2){
    if (conta1.getQuantidade()>conta2.getQuantidade()){
        return conta1;}
    else {return conta2;
    }
    }
}






