package desafiopoo2guilhermegomes;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioPOO2GuilhermeGomes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int res0 = 0;
        int res1 = 0;
        System.out.println("Quantas crianças são?");
        num = sc.nextInt();

        num += 1;

        String resp[] = new String[num];

        System.out.println("Insira DEPOIS do nome das crianças comportadas = + , e para as não comportadas = -");

        for (int i = 0; i < num; i++) {

            resp[i] = sc.nextLine();
        }

        for (String valor : resp) {

            int busca = valor.lastIndexOf("+");

            if (busca > 0) {
                res1 = res1 + 1;
            } else {
                res0 = res0 + 1;
            }

        }

        System.out.println("Em ordem alfabética:");

        Arrays.sort(resp);

        for (String resp1 : resp) {
            System.out.println(resp1);
        }

        System.out.println("Das " + (num - 1) + " crianças, " + res1 + " se comportaram " + (res0 - 1) + " não se comportaram.");

    }
}
