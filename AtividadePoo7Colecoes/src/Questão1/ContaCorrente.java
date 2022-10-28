package Questão1;

public class ContaCorrente {

    int numeroConta;
    String titular;
    double saldo;

    @Override
    public String toString() {
        String saida;
        saida = String.format("Titular.....:%s\n", this.titular)
                + String.format("Num.Conta...:%d\n", this.numeroConta)
                + String.format("Saldo.......:R$%.2f\n", this.saldo);

        return saida;
    }

    public ContaCorrente(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
}
