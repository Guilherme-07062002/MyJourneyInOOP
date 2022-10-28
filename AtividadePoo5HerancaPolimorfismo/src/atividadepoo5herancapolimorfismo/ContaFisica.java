package atividadepoo5herancapolimorfismo;

public class ContaFisica extends ContaCorrente {

    int CPFCliente;
    double rendaMensal;

    @Override
    public double sacar(String agencia, int numeroConta, double valor) {
        if (numeroConta == getNumeroConta() && agencia == getAgencia()) {
            if (valor < getLimiteSaque()) {
                if (getRendaMensal() > 5000 && getSaldo() == 0) {
                    setSaldo(getSaldo() + 800);
                    this.saldo += valor;
                    System.out.println("Você sacou R$" + valor + " com o acrescimo de R$800.");
                    System.out.println("Seu saldo é de: R$" + this.getSaldo());
                } else if (getRendaMensal() < 5000 && getSaldo() == 0 || (this.saldo - valor) < 0) {
                    System.out.println("Saque não foi autorizado ou saque insuficiente.");
                } else if (getRendaMensal() < 5000 && getSaldo() > 0) {
                    System.out.println("Você sacou " + valor);
                    System.out.println("Seu saldo é de: R$" + (this.getSaldo() - valor));

                }

            } else {
                System.out.println("O saque não pode ser executado, superou o limite de R$3000");
            }
        } else {
            System.out.println("Numero ou agencia invalido.");
        }
        return getSaldo();
    }

    public ContaFisica(int CPFCliente, double rendaMensal, String agencia, int numeroConta, double saldo) {
        super(agencia, numeroConta, saldo);
        this.CPFCliente = CPFCliente;
        this.rendaMensal = rendaMensal;
        this.limiteSaque = 3000;
    }

    public int getCPFCliente() {
        return CPFCliente;
    }

    public void setCPFCliente(int CPFCliente) {
        this.CPFCliente = CPFCliente;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

}
