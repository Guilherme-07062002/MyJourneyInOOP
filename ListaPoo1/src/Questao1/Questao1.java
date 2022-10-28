
package Questao1;

import java.util.Scanner;


public class Questao1 {

    
    public static void main(String[] args) {
        // Exemplificando estrutura de controle
        
        Scanner sc = new Scanner(System.in);
        int resultado;
        int numero = 1;
        int numero2 = 2;
        
        //darei a condição de que os numeros só poderão ser somados se o primeiro numero for menor que o segundo
        
        if( numero < numero2){
            resultado = (numero + numero2);
        }else{
            System.out.println("Primeiro numero não é menor que o segundo");
        }
    }
    
}
