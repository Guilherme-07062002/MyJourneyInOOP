package Questão1;

import java.util.Scanner;

public class Ano {

   

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Quantos registros de consumo serão digitados?");
        int n = sc.nextInt();
        int carga = 50;
        int minutos = 0;
        int diferenca = 0;
      int eventos[] = new int[n];
      
      for(int i = 0; i < n; i++){
          System.out.print((i + 1) + "°> ");
          eventos[i] = sc.nextInt();
          minutos += eventos[i];
          if((eventos[i] + carga) <= 100){
              carga += eventos[i];
          }else{
              carga += eventos[i];
              diferenca = carga - 100;
              carga -= diferenca;
          }
      }
      
      for(int reg: eventos){
        System.out.println(reg);
      }
        System.out.println("-----------");
        System.out.println("Foram jogados " + minutos + " minutos de jogo"
                + " e resultou em uma carga final de: " + carga);
      

    }

}
