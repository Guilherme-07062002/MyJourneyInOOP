package atividadepoo2vetores;

import java.util.Scanner;

public class Questão1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int n[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println(" Insira um numero:");
            n[i] = sc.nextInt();

            soma = soma + n[i];

        }
        System.out.println("Resultado dos valores somados:" + soma);

    }

}
