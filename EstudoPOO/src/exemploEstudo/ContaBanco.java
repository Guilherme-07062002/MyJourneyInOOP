package exemploEstudo;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private Boolean status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, Boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public void abrirConta(int numConta) {
        if (numConta == this.numConta) {

            if ("cc".equals(getTipo())) {
                System.out.println("você abriu uma conta corrente e ganha 50 R$");
                setSaldo( getSaldo() + 50);
                setStatus(true);
            } else if ("cp".equals(this.tipo)) {
                System.out.println("você abriu uma conta poupança e ganha 150 R$");
                setSaldo(getSaldo() + 150);
                setStatus(true);
            } else {
                System.out.println("Você não abriu nenhuma conta.");
            }
        } else {
            System.out.println("Numero de conta invalido");
        }
    }

    public void fecharConta(int numConta) {
        if (numConta == getNumConta()) {

            setStatus(false);
        } else {
            System.out.println("Numero de conta invalido");
        }
    }

    public double depositar(double valor) {
        if (getStatus()==true) {
           setSaldo(getSaldo() + valor);
            System.out.println("Deposito concluido");
        } else {
            System.out.println("Não foi possivel depositar, pois sua conta está fechada");
        }
        return getSaldo();
    }

    public double sacar(double valor) {
        if (valor <= getSaldo() && getStatus() == true) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque concluido");
        } else if (getStatus() == false) {
            System.out.println("Não foi possivel sacar ,pois a sua conta está fechada");
        } else {
            System.out.println("Você não tem saldo suficiente.");
        }
        return getSaldo();
    }

    public void pagarMensal() {
        double mensalidade = 200;
        System.out.println("O valor da mensalidade é de 200 reais");
        if (getSaldo() >= mensalidade) {
            setSaldo(getSaldo() - mensalidade);
            System.out.println("A mensalidade foi paga");
            setStatus(true);
        } else {
            System.out.println("Pague a mensalidade ou a conta sera bloqueada");
        }

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    

    public void status() {
        System.out.println("DADOS DA CONTA:");
        System.out.println("Numero da Conta: " + this.numConta);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);

    }

}
