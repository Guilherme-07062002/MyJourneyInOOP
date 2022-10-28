package br.edu.ifrn.atividade.funcionario;

public class PrincipalFuncionario {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("João");
        f1.setSalario(1000);
        f1.setPorcent(10);
        f1.setIdFuncionario("1234-5");

        //f1.aumentarSalario(f1.getSalario(), f1.getPorcent());
        // f1.diminuirSalario(f1.getSalario(), f1.getPorcent());
        
        //Insira no parametro do metodo analisarFerisa na seguinte ordem:
        //a id do funcionario, ano , mes e data das ultimas ferias.
        f1.analisarFerias("1234-5", 2020, 12, 31);
        //eu apenas adicionei mais alguns dados na saida para ficar mais detalhado.
    }
}
