package atividadepoo2vetores;

import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String nome;

        System.out.println("Quantos alunos tem na sala?");
        numero = sc.nextInt();

        numero += 1;

        String num[] = new String[numero];
        System.out.println("digite o nome do aluno");

        for (int i = 0; i < numero; i++) {

            num[i] = sc.nextLine();

        }
        for (String valor : num) {
            System.out.println(valor);
        }
 
        int random = 1 + (int) (Math.random() * numero);

        System.out.println("O sorteadx foi o numero " + random + " " + num[random]);
    }
}
