package exercicios;

public class ContaPoupanca {
    private String nome;
    private double saldo;
    private int numConta;
    private int numAgencia;

    public ContaPoupanca(double saldo_inicial) {
        this.saldo = saldo_inicial;
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

    public String depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return "Depósito efetuado!";
        }
        return "Depósito não efetuado! Verifique o valor informado!";
    }

    public String sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            return "Saque efetuado! Retire seu dinheiro";
        }
        return "Erro ao efetuar o saque! Verifique o valor informado!";
    }

}
