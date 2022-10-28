package atividadepoo6tratamentoexcecao;

public class Triangulo extends FormaGeometrica {

    double base, altura;

    @Override
    public double calculaArea() {
        area = getBase() * getAltura() / 2;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
