public class Main {

    public static void main(String[] args) {

        Conta conta1 = new Conta("João", 123, 3000);

        Conta conta2 = new Conta("Maria", 456, 2000);


        Conta contaComMaisDinheiro = Conta.compararContas(conta1, conta2);

        System.out.println("A conta com mais dinheiro é a de " + contaComMaisDinheiro.getTitular());
    }
}
