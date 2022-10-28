package atividadepoo1strings;

import java.util.Scanner;

public class Questão5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.println("Digite algo e direi a primeira e a ultima letra");
        texto = sc.nextLine();

        int total = texto.length();

        char primeiro = texto.charAt(0);
        char ultimo = texto.charAt(total - 1);

        System.out.println("Primeira letra: " + primeiro);
        System.out.println("Ultima letra: " + ultimo);

    }
}
