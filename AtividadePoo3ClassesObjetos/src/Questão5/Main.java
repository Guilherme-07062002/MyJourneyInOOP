package Questão5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operação;
        int numero;
        double quant;

        Conta c = new Conta();
        Conta c2 = new Conta();

        //Instanciando variaveis conta c
        
        c.agencia = "caixa";
        c.numeroConta = 1178;
        c.saldo = 500.0;
        //Instanciando variaveis conta c2
        
        c2.agencia = "bradesco";
        c2.numeroConta = 8910;
        c2.saldo = 600.0;
        
        /*Decidi exibir essas perguntas no metodo main para ser algo mais dinamico, e mais
        parecido com mexer num caixa real
        */

        System.out.println("Qual operação será realizada?");
        System.out.println("Digite 1 para saque, 2 para deposito e 3 para transferencia:");
        operação = sc.nextInt();

        switch (operação) {

            case 1:

                System.out.println("Insira o numero da conta");
                numero = sc.nextInt();
                System.out.println("Insira o quanto deseja sacar:");
                quant = sc.nextDouble();
                if (numero == c.numeroConta) {
                    Conta.saque(c.saldo, quant);
                } else {
                    Conta.saque(c2.saldo, quant);
                }
                break;
            case 2:

                System.out.println("Insira o numero da conta");
                numero = sc.nextInt();
                System.out.println("Insira o quanto deseja depositar:");
                quant = sc.nextDouble();
                if (numero == c.numeroConta) {
                    Conta.deposito(c.saldo, quant);
                } else {
                    Conta.deposito(c2.saldo, quant);
                }
                break;

            case 3:

                System.out.println("Insira o numero da conta que será transferido:");
                numero = sc.nextInt();
                System.out.println("Insira o valor que sera transferido:");
                quant = sc.nextDouble();
                if (numero == c.numeroConta) {
                    Conta.transferencia(c2.saldo, quant);
                } else {
                    Conta.transferencia(c.saldo, quant);
                }

                break;
        }

    }

}
