package atividadepoo8persistdados;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File fileClientes = new File("Clientes.txt");
        File fileProduto = new File("Produtos.txt");
        String op;
        int escolha;
        boolean fim;
        try {
            do {
                System.out.print("=========MENU=========\n"
                        + "O que deseja fazer?\n"
                        + "1 = Cadastrar Cliente\n"
                        + "2 = Cadastrar Produto\n"
                        + "3 = Exibir clientes\n"
                        + "4 = Exibir produtos\n"
                        + "0 = Sair\n"
                        + "> ");
                escolha = sc.nextInt();
                System.out.println("");
                if (escolha >= 0 && escolha <= 4) {
                    switch (escolha) {
                        case 3:
                            try (FileReader fr = new FileReader(fileClientes)) {
                                char[] in = new char[500];
                                fr.read(in);

                                System.out.println("===================CLIENTES==================");
                                for (char c : in) {
                                    System.out.print(c);
                                }
                                System.out.println("\n");
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
                                    fw.write("Cliente: " + funcionario + "  || Email: " + email + "\n");
                                    fw.flush();
                                    System.out.println("Quer continuar? Digite N para parar");
                                    op = sc.next();
                                    if (op.contains("Nn")) {
                                        fim = true;
                                    }
                                } while (fim = false);

                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;

                        case 2:
                            try (FileWriter fw = new FileWriter(fileProduto, true);) {
                                do {
                                    System.out.print("Digite o nome do produto: ");
                                    String produto = sc.next();
                                    System.out.print("Insira seu preço: ");
                                    String preco = sc.next();
                                    fw.write("Produto: " + produto + "  ||  Preço: R$" + preco + "\n");
                                    fw.flush();
                                    System.out.println("Quer continuar? Digite N para parar");
                                    op = sc.next();
                                    if (op.contains("Nn")) {
                                        fim = true;
                                    }
                                } while (fim = false);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case 4:
                            try (FileReader fr = new FileReader(fileProduto)) {
                                char[] in = new char[500];
                                fr.read(in);

                                System.out.println("============PRODUTOS============");
                                for (char c : in) {
                                    System.out.print(c);
                                }
                                System.out.println("\n");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente.\n");
                }
            } while (escolha != 0);
            System.out.println("Fechando programa...");
        } catch (java.util.InputMismatchException e1) {
            System.err.println("Erro: valor incorreto.");
        } catch (Throwable e3) {
            System.out.println("Algo deu errado, por favor tente novamente.");
        }
    }
}
