package PersistArquiv;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterReaderTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fileClientes = new File("Clientes.txt");
        File fileProduto = new File("Produtos.txt");
        int op;
        int escolha;
        do {
            System.out.print("=====================\n"
                    + "O que deseja fazer?\n"
                    + "1 = Cadastrar Cliente\n"
                    + "2 = Cadastrar Produto\n"
                    + "3 = Exibir clientes\n"
                    + "4 = Exibir produtos\n"
                    + "0 = Sair\n"
                    + "> ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 3:
                    try (FileReader fr = new FileReader(fileClientes)) {
                        char[] in = new char[500];
                        int size = fr.read(in);
                        //System.out.println("Tamanho: " + size);
                        for (char c : in) {
                            System.out.print(c);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

                case 1:
                    try (FileWriter fw = new FileWriter(fileClientes, true);) {
                        do {

                            System.out.print("Digite o nome do Cliente: ");
                            String funcionario = sc.next();
                            System.out.print("Insira seu email: ");
                            String email = sc.next();
                            fw.write("Cliente: " + funcionario + "|| Email: " + email + "\n");
                            fw.flush();
                            System.out.println("Quer continuar? Aperte 0 para parar");
                            op = sc.nextInt();
                        } while (op != 0);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                //-----------------------------------------------------------------
                case 2:

                    try (FileWriter fw = new FileWriter(fileProduto, true);
                            ) {
                        do {
                            System.out.print("Digite o nome do produto: ");
                            String produto = sc.next();
                            System.out.print("Insira seu preço: ");
                            String preco = sc.next();
                            fw.write("Produto: " + produto + "|| Preço: " + preco + "\n");
                            fw.flush();
                            System.out.println("Quer continuar? Aperte 0 para parar");
                            op = sc.nextInt();
                        } while (op != 0);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try (FileReader fr = new FileReader(fileProduto)) {
                        char[] in = new char[500];
                        int size = fr.read(in);
                        //System.out.println("Tamanho: " + size);
                        for (char c : in) {
                            System.out.print(c);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;

            }
        } while (escolha != 0);

        /* try {
            //file,true serve pra dar um append no arquivo
            FileWriter fw = new FileWriter(file);
            fw.write("\nEscrevendo uma mensagem no arquivo\nPulando uma linha2\n");
            fw.flush();
            fw.close();
            
            FileReader fr = new FileReader(file);
            char[] in = new char[500];
            int size = fr.read(in);
            System.out.println("Tamanho: "+size);
            for(char c:in){
                System.out.print(c);
            }
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }
}
