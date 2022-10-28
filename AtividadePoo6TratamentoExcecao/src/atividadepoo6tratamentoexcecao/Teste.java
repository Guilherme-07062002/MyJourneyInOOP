package atividadepoo6tratamentoexcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        Trapezio trapezio = new Trapezio();
        Circulo circulo = new Circulo();

        int list[] = {0, 1, 2};
        int resp;
        System.out.println("--------------CALCULO DE AREA-------------------");
        try {
            System.out.println("De qual forma geometrica você quer calcular a area?\nDigite: 0 pra Triângulo,1 pra Trapézio ou 2 pra Circulo");
            resp = sc.nextInt();
            System.out.println("-----------------------------------------------------");

            int r = list[resp];
            switch (r) {
                case 0:
                    System.out.println("(Caso números negativos sejam inseridos, eles serão convertidos automaticamente)");
                    System.out.println("Digite o valor da base do Triangulo: ");
                    triangulo.setBase(Math.abs(sc.nextDouble()));
                    System.out.println("Digite o valor da altura do Triangulo: ");
                    triangulo.setAltura(Math.abs(sc.nextDouble()));

                    System.out.println("A area do triângulo é:" + triangulo.calculaArea());
                    break;
                case 1:

                    System.out.println("(Caso números negativos sejam inseridos, eles serão convertidos automaticamente)");
                    System.out.println("Digite o valor da base menor do trapézio: ");
                    trapezio.setBaseMenor(Math.abs(sc.nextDouble()));
                    System.out.println("Digite o valor da base maior do trapézio: ");
                    trapezio.setBaseMaior(Math.abs(sc.nextDouble()));
                    System.out.println("Digite valor da altura do trapézio: ");
                    trapezio.setAltura(Math.abs(sc.nextDouble()));

                    System.out.println("A area do trapézio é:" + trapezio.calculaArea());
                    break;
                case 2:
                    System.out.println("(Caso números negativos sejam inseridos, eles serão convertidos automaticamente)");
                    System.out.println("Digite o valor do raio do circulo: ");
                    circulo.setRaio(Math.abs(sc.nextInt()));

                    System.out.println("A area do circulo é:" + circulo.calculaArea());
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ERRO: número inválido, tente novamente.");
        } catch (InputMismatchException e2) {
            System.out.println("Erro, por favor insira apenas números.");
        } catch (Throwable e3) {
            System.out.println("Algo deu errado, por favor tente novamente.");
        }

    }
}
