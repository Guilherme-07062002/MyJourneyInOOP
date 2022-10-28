package Questão5;

public class Conta {

    String agencia;
    int numeroConta;
    double saldo;

    public static void saque(double saldo, double quant) {

        double sub;

        if (saldo >= quant) {
            sub = saldo - quant;
            System.out.println("Você sacou " + quant + "R$ e ainda tem " + sub + "R$ depositados.");
        } else {
            System.out.println("Dinheiro insuficiente para finalizar o procedimento");
            System.out.println("Você so tem " + saldo + "R$ disponivel");
        }
    }

    public static void deposito(double saldo, double quant) {
        double soma;

        soma = quant + saldo;
        System.out.println("Você depositou " + quant + "R$ e tem o total de  " + soma + "R$ depositados.");

    }

    public static void transferencia(double saldo, double quant) {
        double soma;
        double sub;
        if (saldo >= quant) {

            sub = saldo - quant;
            System.out.println("Você transferiu " + quant + "R$ e ainda tem o total de  " + sub + "R$ disponivel na sua conta.");
        } else {
            System.out.println("Dinheiro insuficiente para finalizar o procedimento");
            System.out.println("Você so tem " + saldo + "R$ disponivel");
        }
    }

}
