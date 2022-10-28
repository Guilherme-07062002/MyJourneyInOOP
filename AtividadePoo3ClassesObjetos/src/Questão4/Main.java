package Questão4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Interrogatorio r = new Interrogatorio();
        String mensagem;

        /*Decidi optar por instanciar as variaveis com o que o usuario digitar pois achei
        que dessa forma o codigo talvez seria mais interessante/dinamico
         */
        System.out.println("Telefonou para a vítima?");
        r.resposta[0] = sc.nextLine();

        System.out.println("Esteve no local do crime?");
        r.resposta[1] = sc.nextLine();

        System.out.println("Mora perto da vítima?");
        r.resposta[2] = sc.nextLine();

        System.out.println("Devia para a vítima?");
        r.resposta[3] = sc.nextLine();

        System.out.println("Já trabalhou com a vítima?");
        r.resposta[4] = sc.nextLine();

        mensagem = Interrogatorio.interrogatorio(r.resposta);
        System.out.println("O suspeito foi declarado como: " + mensagem);

    }
}
