package poo.revisao;

public class Residencial extends Construcao {
    // ------------------ Atributos ------------------
    private int num;
    private String nome;
    private boolean ocupada;
    
    // ----------------- Construtor ------------------
    public Residencial(String nome, boolean ocupada, double valor) {
        super();
        this.nome = nome;
        this.ocupada = ocupada;
    }

    // ------------- Getters and Setters -------------
    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }

    public boolean getOcupada() {
        return this.ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}
