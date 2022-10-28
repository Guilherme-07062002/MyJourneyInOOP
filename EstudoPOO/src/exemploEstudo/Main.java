package exemploEstudo;

public class Main {

    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco(100, "cc", "João", 1500, true);

        c1.abrirConta(100);
        //c1.depositar(500);
        //c1.fecharConta(100);
        //c1.pagarMensal();
        //c1.sacar(1400);
        c1.status();

    }
}
