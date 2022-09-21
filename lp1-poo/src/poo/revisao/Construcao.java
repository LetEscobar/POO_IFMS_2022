package poo.revisao;

public abstract class Construcao {
    protected int qtdPortas;
    protected int qtdJanelas;
    protected double valor;

    public int getQtdPortas() {
        return this.qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getQtdJanelas() {
        return this.qtdJanelas;
    }

    public void setQtdJanelas(int qtdJanelas) {
        this.qtdJanelas = qtdJanelas;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
