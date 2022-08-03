package exercicios;

public class ContaCorrente {
    private String nome;
    private double saldo;
    private int numConta;
    private int numAgencia;
    private double limite;

    public ContaCorrente(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return this.numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numConta;
    }

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito efetuado!");
            System.out.println("Saldo = R$ " + this.saldo);
        }
        System.out.println("Depósito não efetuado! Verifique o valor informado!");
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo + this.limite) {
            this.saldo -= valor;
            System.out.println("Saque efetuado! Retire seu dinheiro");
            System.out.println("Saldo = R$ " + this.saldo);
        }
        System.out.println("Erro ao efetuar o saque! Verifique o valor informado!");
    }

}
