package br.edu.ifrn.atividade.geometria;

public class Quadrado {

    private int lado;

    public int calcularPerimetro() {

        int resultado = this.getLado() + this.getLado();
        System.out.println("Perimetro do quadrado: " + resultado);
        return resultado;
    }

    public double calcularArea() {
        double result = this.getLado() * this.getLado();
        System.out.println("Area do quadrado: " + result);
        return result;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
