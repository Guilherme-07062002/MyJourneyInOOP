package Questao2;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.println("Digite um numero");
        n = sc.nextInt();
        
        int numero = 1;
        
        for (int i = n; i > 0; i--) {
         //gera numero de linhas
            
            for (int j = 0;j < i; j++,numero ++) {
                //gerar os numeros das linhas
                System.out.print(numero + " ");
            }
            System.out.println(" ");
            
            
                  
        }
    
    }
    
}
