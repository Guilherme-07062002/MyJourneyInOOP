package atividadepoo1strings;

import java.util.Scanner;

public class Questão4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String mensagem = "Queridx amigx";
        String genero;

        System.out.println("Insira seu genero como feminino, masculino ou deixe o campo vazio caso não deseje informar: ");
        genero = sc.nextLine();

        switch (genero) {
            case "feminino":
                String feminino = mensagem.replace("x", "a");
                System.out.println(feminino);
                break;
            case "masculino":
                String masculino = mensagem.replace("x", "o");
                System.out.println(masculino);
                break;
            default:
                System.out.println(mensagem);
                break;
        }

    }
}
