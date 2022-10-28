package atividadepoo1strings;

import java.util.Scanner;

public class Questão3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;

        System.out.println("Digite uma frase");
        frase = sc.nextLine();

        System.out.println("O numero de palavras é: " + frase.split(" ").length);

    }

}
