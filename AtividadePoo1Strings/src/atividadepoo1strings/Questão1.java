package atividadepoo1strings;

import java.util.Scanner;

public class Questão1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        String curso;

        System.out.println("Insira seu nome:");
        nome = sc.nextLine();

        System.out.println("Insira o curso que você faz:");
        curso = sc.nextLine();

        System.out.println("Seja bem Vindo ao curso de " + curso + "," + nome + "!!!");

    }

}
