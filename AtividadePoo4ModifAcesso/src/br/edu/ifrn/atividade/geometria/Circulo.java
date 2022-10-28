package br.edu.ifrn.atividade.geometria;

public class Circulo {

    private int diametro;

    public double calcularPerimetro() {
        double raio = this.getDiametro() / 2;
        double resultado = (2 * 3.14) * raio;
        System.out.println("Perimetro do circulo: " + resultado);
        return resultado;
    }

    public double calcularArea() {
        double raio = this.getDiametro() / 2;
        double result = 3.14 * (raio * raio);

        System.out.println("Area do circulo: " + result);
        return result;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

}
