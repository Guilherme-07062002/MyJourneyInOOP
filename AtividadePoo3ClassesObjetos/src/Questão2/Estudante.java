package Questão2;

public class Estudante {

    String nome;
    String curso;
    int idade;
    String situação;

    int notas[] = new int[4];

    public static String calcularMedia(int notas[]) {
        int soma;
        String sit = null;
        int mult1 = notas[0] * 2;
        int mult2 = notas[1] * 2;
        int mult3 = notas[2] * 3;
        int mult4 = notas[3] * 3;

        soma = mult1 + mult2 + mult3 + mult4;

        double resultado = soma / 10;

        if (resultado >= 60) {
            sit = "Aprovado";
        } else if (resultado >= 20 && resultado < 60) {
            sit = "em Recuperação";
        } else if (resultado < 20) {
            sit = "Reprovado";
        }

        return sit;

    }

}
