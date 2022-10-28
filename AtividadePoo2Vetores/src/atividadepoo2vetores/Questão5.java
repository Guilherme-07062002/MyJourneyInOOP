package atividadepoo2vetores;


import java.util.Scanner;

public class Questão5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int res0 = 0;
        int res1 = 0;
        System.out.println("Quantos candidatos foram inscritos?");
        num = sc.nextInt();

        int resp[] = new int[num];

        System.out.println("Digite 1 para os candidatos presentes e 0 para os que faltaram");

        for (int i = 0; i < num; i++) {
            resp[i] = sc.nextInt();
        }
        for (int valor : resp) {
            System.out.println(valor);
            if (valor > 0) {
                res1 = res1 + 1;
            } else {
                res0 = res0 + 1;
            }
        }
        System.out.println("Dos " + num + " candidatos inscritos, " + res1 + " compareceram e " + res0 + " não compareceram.");

    }
}
