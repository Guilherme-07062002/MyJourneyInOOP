package br.edu.ifrn.atividade.geometria;

public class Triangulo {

    int lado;

    public int calcularPerimetro() {

        int resultado = this.getLado() + this.getLado();
        System.out.println("Perimetro do triangulo: " + resultado);
        return resultado;
    }

    public double calcularArea() {
        double result = (this.getLado() * this.getLado()) / 2;
        System.out.println("Area do triangulo: " + result);
        return result;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

}
