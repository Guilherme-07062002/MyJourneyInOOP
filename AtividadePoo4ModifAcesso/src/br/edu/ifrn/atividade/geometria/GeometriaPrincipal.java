package br.edu.ifrn.atividade.geometria;

public class GeometriaPrincipal {

    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        Circulo c = new Circulo();

        //valor dos lados do quadrado:
        q.setLado(4);
        //valor dos lados do triangulo(Supondo que seja um triangulo equilatero):
        t.setLado(8);
        //valor do diametro do circulo:
        c.setDiametro(4);

        //area e perimetro do quadrado q
        q.calcularArea();
        q.calcularPerimetro();
        //area e perimetro do triangulo t
        t.calcularArea();
        t.calcularPerimetro();
        //area e perimetro do circulo c
        c.calcularArea();
        c.calcularPerimetro();

    }
}
