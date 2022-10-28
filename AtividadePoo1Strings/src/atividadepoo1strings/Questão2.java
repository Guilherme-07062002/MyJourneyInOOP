package atividadepoo1strings;

import java.util.Scanner;

public class Questão2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto;

        System.out.println("Insira um texto com no máximo 280 caracteres");
        texto = sc.nextLine();

        int tamanho = texto.length();

        if (tamanho >= 280) {
            System.out.println("O texto tem: " + tamanho + " caracteres e expirou o tamanho máximo de 280 caracteres");
        }

    }

}
