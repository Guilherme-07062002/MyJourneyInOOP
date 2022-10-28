package Serializacao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> mapa = new TreeMap<Integer, String>();
        int op;
        do{
          
        System.out.println("Insira o numero do carro: ");
        Integer num = sc.nextInt();
        System.out.println("Insira a cor do carro: ");
        String cor = sc.next();
        mapa.put(num, cor);
            System.out.println("Quer continuar? Digite 0 para parar.");
            op = sc.nextInt();
        }while(op != 0);
        try{
            FileOutputStream fluxoOut = new FileOutputStream("myFile.txt");
            ObjectOutputStream fOut = new ObjectOutputStream(fluxoOut);
            fOut.writeObject(mapa);
            FileInputStream fluxoIn = new FileInputStream("myFile.txt");
            ObjectInputStream fIn = new ObjectInputStream(fluxoIn);
            TreeMap<Integer, String> mapaNovo = (TreeMap)fIn.readObject();
            fIn.close();
            fOut.close();
            System.out.println(mapaNovo);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
