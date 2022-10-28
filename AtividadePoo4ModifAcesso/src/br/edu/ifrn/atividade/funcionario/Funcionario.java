package br.edu.ifrn.atividade.funcionario;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;

public class Funcionario {

    private String idFuncionario;
    private String nome;
    private double salario;
    private double porcent;
    String dataFerias;

    public double aumentarSalario(double salario, double porcent) {
        this.salario = salario;
        this.porcent = porcent;

        double valor = (salario * porcent) / 100;

        double result = salario + valor;
        System.out.println("Funcionario recebeu aumento de: " + porcent + "% e agora está com: " + result + "R$");

        return result;
    }

    public double diminuirSalario(double salario, double porcent) {
        this.salario = salario;
        this.porcent = porcent;

        double valor = (salario * porcent) / 100;

        double result = salario - valor;
        System.out.println("O salario do funcionario diminuiu em " + porcent + "% e agora está com: " + result + "R$");

        return result;
    }

    public void analisarFerias(String idFuncionario, int ano, int mes, int dia) {

        if (this.idFuncionario == null ? idFuncionario == null : this.idFuncionario.equals(idFuncionario)) {
            System.out.println("Funcionario: " + this.idFuncionario);

            org.joda.time.format.DateTimeFormatter dtfPadrao = DateTimeFormat.forPattern("dd/MM/yyyy");

            DateTime d = new DateTime();

            DateTime d2 = new DateTime(ano, mes, dia, 0, 0);

            int anoAtual = d.year().get();
            int anoFerias = d2.year().get();
            int proxAno = anoAtual + 1;

            DateTime d3 = new DateTime(proxAno, 1, 1, 0, 0);
            DateTime d4 = new DateTime(anoFerias, 1, 1, 0, 0);

            System.out.println("Data das ultimas ferias: " + d2.toString(dtfPadrao));

            int dias = Days.daysBetween(d2.toLocalDate(), d.toLocalDate()).getDays();
            int dias2 = Days.daysBetween(d.toLocalDate(), d3.toLocalDate()).getDays();
            int dias3 = Days.daysBetween(d4.toLocalDate(), d.toLocalDate()).getDays();

            if (dias >= 365) {

                System.out.println("Funcionario tem direito a ferias");
                System.out.println("Ja fazem: " + dias + " dias que o funcionario não entrou de ferias");
                System.out.println("Data que deveria ter tirado ferias: " + d4.toString(dtfPadrao) + " (supondo que ele entra de ferias dia primeiro de janeiro)");
                System.out.println("Então ele esta com: " + dias3 + " dias de atraso");
            } else {
                System.out.println("Ferias do funcionario estão em dia");
                System.out.println("Data que o funcionario deverá tirar ferias: " + d3.toString(dtfPadrao) + " (supondo que ele entra de ferias dia primeiro de janeiro)");
                System.out.println("Daqui a: " + dias2 + " dias o funcionario podera tirar ferias novamente");
            }
        } else {
            System.out.println("ID invalida");
        }

    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcent() {
        return porcent;
    }

    public void setPorcent(double porcent) {
        this.porcent = porcent;
    }

    public String getDataFerias() {
        return dataFerias;
    }

    public void setDataFerias(String dataFerias) {
        this.dataFerias = dataFerias;
    }

}
