
package Questão3;

import java.util.Scanner;


public class Questao3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        
        System.out.println("Informe quantidade de pontos");
        int n = sc.nextInt();
        double perimetro = 0;
         int x1 = 0,y1 = 0;
       
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Informe os valores de x,y do "+ 
                    i+"° ponto: ");
            if (i ==1) {
                x1 = sc.nextInt();
                y1 = sc.nextInt();
            }else{
               int xorigem = sc.nextInt();
               int yorigem = sc.nextInt();
            }
            
         }
       
    }
    public static double distancia(int x1,int x2,int y1,int y2){
    double n1 = Math.pow(x2-x1, 2);
    double n2 = Math.pow(y2-y1, 2);
    double soma = n1 + n2;
        
         double d = Math.sqrt(soma);

    return d;
    
    
    }
}
