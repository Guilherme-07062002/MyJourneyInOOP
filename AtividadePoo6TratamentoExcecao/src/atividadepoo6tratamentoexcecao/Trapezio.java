package atividadepoo6tratamentoexcecao;

public class Trapezio extends FormaGeometrica {

    double baseMaior, baseMenor, altura;

    @Override
    public double calculaArea() {
        area = ((getBaseMaior() + getBaseMenor()) * getAltura()) / 2;
        return area;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
