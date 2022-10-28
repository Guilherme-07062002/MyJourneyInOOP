package atividadepoo5herancapolimorfismo;

public class ContaJuridica extends ContaCorrente {

    int CNPJ;
    double capitalInvestido;

    @Override
    public double sacar(String agencia, int numeroConta, double valor) {
        if (numeroConta == getNumeroConta() && agencia == getAgencia()) {
            if (valor < getLimiteSaque()) {
                System.out.println("Você sacou R$" + valor);
                System.out.println("Seu saldo é de: R$" + (this.getSaldo() - valor));
                if (this.getSaldo() - valor < 0) {
                    double dif = this.getSaldo() - valor;

                    System.out.println("O valor excedente do saque foi subtraido de seu capital investido.");
                    System.out.println("Você sacou R$" + valor);
                    System.out.println("Seu saldo é agora é de: R$" + 0);
                    setSaldo(0);
                    if ((getCapitalInvestido() + dif) > 0) {
                        System.out.println("Capital investido: R$" + getCapitalInvestido());
                        System.out.println("E seu capital investido agora é de: R$" + (getCapitalInvestido() + dif));
                        setCapitalInvestido(getCapitalInvestido() + dif);
                    } else {
                        System.out.println("Capital investido: R$" + getCapitalInvestido());
                        System.out.println("Seu capital investido não era suficiente logo, você tem uma divida de: R$" + (getCapitalInvestido() + dif));
                        setCapitalInvestido(getCapitalInvestido() + dif);
                    }
                }
            } else {
                System.out.println("O saque não pode ser executado, superou o limite de R$10000");
            }
        } else {
            System.out.println("Numero de conta ou agencia invalido(s)");
        }
        return getSaldo();
    }

    public ContaJuridica(int CNPJ, double capitalInvestido, String agencia, int numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
        this.CNPJ = CNPJ;
        this.capitalInvestido = capitalInvestido;
        this.limiteSaque = 10000;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public double getCapitalInvestido() {
        return capitalInvestido;
    }

    public void setCapitalInvestido(double capitalInvestido) {
        this.capitalInvestido = capitalInvestido;
    }

}
