package atividadepoo6tratamentoexcecao;

public class Circulo extends FormaGeometrica {

    double raio;
    final double pi = 3.14;

    @Override
    public double calculaArea() {
        area = (pi * getRaio()) * (pi * getRaio());
        return area;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
