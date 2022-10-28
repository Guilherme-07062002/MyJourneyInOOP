package Questão1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaCorrente> Conta = new ArrayList();
        String titular;
        int numConta, op;
        double saldo;
        try {
            do {

                System.out.println("==================\n"
                        + "-----CADASTRO-----\n");
                System.out.print("Digite:\n"
                        + "1 = Criar nova conta\n"
                        + "2 = Exibir contas\n"
                        + "0 = Sair\n"
                        + "==================\n"
                        + "> ");
                op = sc.nextInt();
                if (op >= 0 && op <= 2) {
                    switch (op) {
                        case 1:
                            System.out.print("Digite o titular: ");
                            titular = sc.next();
                            System.out.print("Digite o numero da conta: ");
                            numConta = sc.nextInt();
                            System.out.print("Digite o saldo: ");
                            saldo = sc.nextDouble();
                            ContaCorrente c = new ContaCorrente(numConta, titular, saldo);
                            Conta.add(c);
                            break;
                        case 2:
                            if (Conta.isEmpty()) {
                                System.out.println("Nenhuma conta cadastrada até o momento.");
                            } else {
                                mostrar(Conta);
                                Thread.currentThread().sleep(3000);
                            }
                            break;
                        case 0:
                            System.out.println("\nFechando programa...");
                            Thread.currentThread().sleep(1000);
                            break;
                    }
                } else {
                    System.err.println("Opção inválida, tente novamente...");
                    Thread.currentThread().sleep(1500);
                }

            } while (op != 0);

        } catch (InputMismatchException e2) {
            System.err.println("Erro, por favor tente novamente inserindo os valores corretos para cada campo.");

        } catch (Throwable e3) {
            System.err.println("Algo deu errado, por favor tente novamente.");
        }

    }

    public static void mostrar(ArrayList<ContaCorrente> lista) {
        System.out.println("===========================\n"
                + "EXIBINDO DADOS NA TELA...\n");
        for (ContaCorrente item : lista) {
            System.out.printf("%s\n", item.toString());
        }
        System.out.println("===========================\n");
    }

}
