package Questão2;

public class Main {

    public static void main(String[] args) {

        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();
        Estudante e3 = new Estudante();

        //instanciando variaveis aluno 1:
        e1.curso = "Informatica";
        e1.idade = 17;
        e1.nome = "Chapeleiro Maluco";
        //atribuindo as notas aluno 1:
        e1.notas[0] = 60;
        e1.notas[1] = 60;
        e1.notas[2] = 60;
        e1.notas[3] = 60;
        //calculando media aluno 1:
        e1.situação = Estudante.calcularMedia(e1.notas);
        System.out.println("O aluno " + e1.nome + " está " + e1.situação);

        //instanciando variaveis aluno 2:
        e2.curso = "Alimentos";
        e2.idade = 18;
        e2.nome = "Alvo Dumbledore";
        //atribuindo as notas aluno 2:
        e2.notas[0] = 15;
        e2.notas[1] = 16;
        e2.notas[2] = 17;
        e2.notas[3] = 18;
        //calculando media aluno 2:
        e2.situação = Estudante.calcularMedia(e2.notas);
        System.out.println("O aluno " + e2.nome + " está " + e2.situação);

        //instanciando variaveis aluno 3:
        e3.curso = "MSI";
        e3.idade = 17;
        e3.nome = "Anakin Skywalker";
        //atribuindo as notas aluno 3:
        e3.notas[0] = 59;
        e3.notas[1] = 58;
        e3.notas[2] = 57;
        e3.notas[3] = 56;
        //calculando media aluno 3:
        e3.situação = Estudante.calcularMedia(e3.notas);
        System.out.println("O aluno " + e3.nome + " está " + e3.situação);

    }

}
