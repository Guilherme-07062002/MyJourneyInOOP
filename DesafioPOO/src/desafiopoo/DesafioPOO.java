package desafiopoo;

import java.util.Scanner;

public class DesafioPOO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //criação variaveis
        String nome;
        String data;

        System.out.println("Insira o nome completo");
        nome = sc.nextLine();

        System.out.println("Insira a data");
        data = sc.nextLine();
        //aqui a forma que fiz com que eu "separasse as letras foi substituir os espaços por virgulas
        //porque o metodo Split transforma o String em "String[]" o que dificultaria um pouco mais as coisas
        String separado = nome.replaceAll(" ", ",");
        //encontrei a posição da primeira virgula e dai saberia aonde terminaria o primeiro nome e começaria o segundo    
        int pos1 = separado.indexOf(",");
        //somei a posição mais 1 para "pular" a virgula e exibir somente a palavra
        pos1 = pos1 + 1;

        //substring que recebe o nome do meio e o ultimo nome
        String palavra2 = separado.substring(pos1);
        //usei da mesma forma de antes para saber aonde termina o segundo nome e aonde começa o terceiro
        int pos4 = palavra2.indexOf(",");
        pos4 = pos4 + 1;

        //recebendo terceiro nome
        String palavra3 = palavra2.substring(pos4);
        //colocando as iniciais nas variaveis que serão exibidas
        char primeiraletra = separado.charAt(0);
        char segundaletra = palavra2.charAt(0);
        //exibindo a mensagem final
        System.out.println(palavra3 + "." + primeiraletra + "," + segundaletra + ",(" + data + ")");
    }
}
