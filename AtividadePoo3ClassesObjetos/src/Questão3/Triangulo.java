package Questão3;

public class Triangulo {

    int lado[] = new int[3];
    boolean valor;

    /*De acordo com brasil escola: Dados três segmentos de reta distintos, se a soma das medidas de dois 
    deles é sempre maior que a medida do terceiro, então, eles podem formar um triângulo.
    Então:*/
    public static String verificarTriangulo(int lado[]) {

        int soma1 = lado[0] + lado[1];
        int soma2 = lado[0] + lado[2];
        int soma3 = lado[1] + lado[2];
        String resultado = null;

        if (soma1 > lado[2] && soma2 > lado[1] && soma3 > lado[0]) {
            resultado = "Forma um  triangulo";

        } else {
            resultado = "não forma um triangulo,";
        }
        return resultado;

    }

    public static String verificarTipo(int lado[]) {
        String tipo = null;
        int soma1 = lado[0] + lado[1];
        int soma2 = lado[0] + lado[2];
        int soma3 = lado[1] + lado[2];

        if (soma1 > lado[2] && soma2 > lado[1] && soma3 > lado[0]) {
            if (lado[0] == lado[1] && lado[1] == lado[2]) {
                tipo = "do tipo equilatero, ou seja todos os seus lados são iguais.";
            } else if (lado[0] == lado[1] || lado[1] == lado[2]) {
                tipo = "do tipo isósceles, ou seja ao menos dois dos seus lados são iguais.";
            } else if (lado[0] != lado[1] && lado[1] != lado[2] && lado[0] != lado[2]) {
                tipo = "do tipo escaleno, ou seja todos os seus três lados são diferentes.";
            }
        } else {
            tipo = "tente com outros valores.";
        }
        return tipo;
    }
}
