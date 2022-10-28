package atividadepoo2vetores;


import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int v;
        int n[] = new int[100];

        System.out.println("Insira um numero");
        v = sc.nextInt();

        n[0] = v;

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] / 2;
        }

        for (float num : n) {
            System.out.println(num);

        }
    }

}
