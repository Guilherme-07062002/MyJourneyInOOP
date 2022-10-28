package Questão2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoas> nome = new ArrayList();
        ArrayList<Pessoas> nome2 = new ArrayList();
        String entrada;
        boolean fim = false;
        boolean fim2 = false;
        //Recebendo os primeiros valores
        try {
            do {
                System.out.print("Digite um nome:\n"
                        + ">");
                entrada = sc.next();
                if (checarNumero(entrada) == true) {
                    throw new Exception();
                }
                Pessoas pessoa = new Pessoas(entrada);
                nome.add(pessoa);
                if (entrada.contains("fim") || entrada.contains("FIM") || entrada.contains("Fim")) {
                    fim = true;
                }
            } while (fim == false);
            //Recebendo os segundos valores
            System.out.println("\n==NOMES PARA CHECAR==");
            do {
                System.out.print("Digite um nome:\n"
                        + ">");
                entrada = sc.next();
                Pessoas pessoa2 = new Pessoas(entrada);
                nome2.add(pessoa2);
                if (entrada.contains("fim") || entrada.contains("FIM") || entrada.contains("Fim")) {
                    fim2 = true;
                }
            } while (fim2 == false);

            checar(nome, nome2);
        } catch (Exception e1) {
            System.err.println("Erro, insira apenas letras.");
        } catch (Throwable e2) {
            System.out.println("Algo deu errado, tente novamente.");
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

    public static void checar(ArrayList<Pessoas> nome, ArrayList<Pessoas> nome2) {
        String stringNome = nome.stream().map(String::valueOf)
                .collect(Collectors.joining(","));
        String stringNome2 = nome2.stream().map(String::valueOf)
                .collect(Collectors.joining(","));

        stringNome = stringNome.toLowerCase().replace("fim", "");
        //Eliminando ultima virgula da string
        stringNome = Optional.ofNullable(stringNome)
                .filter(s -> s.length() != 0)
                .map(s -> s.substring(0, s.length() - 1))
                .orElse(stringNome);

        stringNome2 = stringNome2.toLowerCase().replace("fim", "");
        //Eliminando ultima virgula da string
        stringNome2 = Optional.ofNullable(stringNome2)
                .filter(s -> s.length() != 0)
                .map(s -> s.substring(0, s.length() - 1))
                .orElse(stringNome2);
        stringNome2.replaceFirst(".$", "");
        stringNome2.split(",");
        System.out.println("\n======RESULTADO======");
        for (String item : stringNome2.split(",")) {
            if (stringNome.contains(item)) {
                System.out.printf("%s : Encontrado\n", item);
            } else if (!stringNome.contains(item) && !"".equals(item)) {
                System.out.printf("%s : Não encontrado.\n", item);
            }

        }

    }
}
