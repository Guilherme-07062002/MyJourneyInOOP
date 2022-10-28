package Questão3;

public class Main {

    public static void main(String[] args) {

        Triangulo t = new Triangulo();

        String mensagem1;
        String mensagem2;
        
        t.lado[0] = 20;
        t.lado[1] = 20;
        t.lado[2] = 20;

        mensagem1 = Triangulo.verificarTriangulo(t.lado);
        mensagem2 = Triangulo.verificarTipo(t.lado);
        
        System.out.println("A figura "+mensagem1+" "+mensagem2);
    }
}
