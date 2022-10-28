package Questão3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList();
        boolean fim = false;
        int op;
        try {
            do {
                System.out.print("=====================\n"
                        + "O que deseja fazer?\n"
                        + "1 = Adiciona\n"
                        + "2 = Remove\n"
                        + "3 = Ordena\n"
                        + "4 = Imprime\n"
                        + "0 = Sair\n"
                        + "> ");
                op = sc.nextInt();
                String entrada;
                if (op >= 0 && op <= 4) {
                    switch (op) {
                        case 1:
                            System.out.println("Digite o nome que será adicionado(Escreva fim para parar):");
                            entrada = sc.next();
                            if (entrada.contains("Fim") || entrada.contains("fim") || entrada.contains("FIM")) {
                                fim = true;
                                System.out.println("\nFechando programa...");
                                break;
                            } else if (checarNumero(entrada) == true) {
                                System.err.println("Por favor insira apenas letras.");
                                break;
                            } else if (lista.contains(entrada)) {
                                throw new Exception();

                            }
                            lista.add(entrada);
                            System.out.println("Adicionando...");
                            Thread.currentThread().sleep(1200);
                            System.out.println("\n" + entrada + " adicionade.\n");
                            break;
                        case 2:
                            System.out.println("Digite o nome que será removido.");
                            entrada = sc.next();
                            if (lista.contains(entrada)) {
                                System.out.println("Removendo...\n");
                                Thread.currentThread().sleep(1200);
                                System.out.println(entrada + " removide.\n");
                                lista.remove(entrada);
                            } else if (checarNumero(entrada) == true) {
                                System.err.println("Por favor insira apenas numeros.");
                                break;
                            } else {
                                System.out.println("Não é possivel apagar um nome que não existe na lista.\n");
                            }

                            break;
                        case 3:
                            if (lista.isEmpty()) {
                                System.err.println("\nLista vazia, nenhum nome para ordenar.\n");
                            } else if (lista.size() == 1) {
                                System.out.println("\nSó tem um nome na lista, insira mais um para poder ordenar.\n");
                            } else {
                                System.out.println("Ordenando...\n");
                                Thread.currentThread().sleep(1200);
                                Collections.sort(lista);
                            }
                            break;
                        case 4:
                            if (lista.isEmpty()) {
                                System.err.println("\nLista vazia, nenhum nome para exibir.\n");
                            } else {
                                System.out.println("Imprimindo...\n");
                                Thread.currentThread().sleep(1200);
                                for (String item : lista) {
                                    System.out.println("   -" + item);
                                }
                                System.out.println("");
                            }
                            break;
                        case 0:
                            System.out.println("\nFechando programa...");
                            fim = true;
                            break;
                    }
                } else {
                    System.out.println("Opção inválida, tente novamente.\n");
                }

            } while (fim == false);
        } catch (java.util.InputMismatchException e1) {
            System.err.println("Erro: valor incorreto.");
        } catch (Exception e2) {
            System.err.println("Esse nome já existe.");

        } catch (Throwable e3) {
            System.out.println("Algo deu errado, por favor tente novamente.");
        }
    }

    public static boolean checarNumero(String entrada) {
        boolean temNumero = false;
        for (int i = 0; i < 10; i++) {
            if (entrada.contains(Integer.toString(i))) {
                temNumero = true;
            }
        }
        return temNumero;
    }
}
