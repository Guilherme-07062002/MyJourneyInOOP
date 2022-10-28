package atividadepoo2vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Questão2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n[] = new int[15];
        int x;
        System.out.println("Pedirei que insira 15 numeros");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Insira um numero");
            n[i] = sc.nextInt();
        }
        
        for(int numero:n){
            System.out.println(numero);
        }
        System.out.println("Digite um numero para saber se ele esta entre os 15");
        x = sc.nextInt();
        
        for (int c = 0; c < n.length; c++) {
            int result = Arrays.binarySearch(n, x);

           
            if (result > 0) {
                int saida = result + 1;
                System.out.println("o valor " + x + " foi o " + saida + " ° numero digitado");

                break;
            }
        }
    }
}
