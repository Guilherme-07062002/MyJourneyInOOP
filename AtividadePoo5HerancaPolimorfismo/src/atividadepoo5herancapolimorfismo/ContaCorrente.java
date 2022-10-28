package atividadepoo5herancapolimorfismo;

public class ContaCorrente {

    String agencia;
    int numeroConta;
    double saldo, limiteSaque;

    public double sacar(String agencia, int numeroConta, double valor) {
        if (numeroConta == getNumeroConta() && agencia == getAgencia()) {
            this.saldo -= valor;
            System.out.println("Você sacou o valor de: R$" + valor);
            System.out.println("Seu saldo é de: R$" + this.getSaldo());
            return this.getSaldo();
        } else {
            System.out.println("Número de conta ou agencia inválido(s).");
            return 0;
        }
    }

    public double depositar(String agencia, int numeroConta, double valor) {
        if (numeroConta == getNumeroConta() && agencia == getAgencia()) {
            this.saldo += valor;
            System.out.println("Você depositou o valor de: R$" + valor);
            System.out.println("Seu saldo agora é de: R$" + this.getSaldo());
            return this.getSaldo();
        } else {
            System.out.println("Número de conta ou agencia inválido(s).");
            return 0;
        }
    }

    public ContaCorrente(String agencia, int numeroConta, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
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
