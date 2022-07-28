public class Cachorro {
    private String nome;
    private int idade;
    private String raca;
    private boolean dono;
    private boolean castrado;
    private double peso;

    // public Cachorro() {
    // }

    public Cachorro(String nome) {
        this.setNome(nome);
        // neste caso, this faz referência a um atributo dessa classe
        System.out.println("Criando o objeto " + this.nome);
    }

    // GETTERS e SETTERS
    // set é para dar um valor ao atributo
    // get é para pegar o valor do atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setDono(Boolean dono) {
        this.dono = dono;
    }

    public Boolean getDono() {
        return this.dono;
    }

    public void setCastrado(Boolean castrado) {
        this.castrado = castrado;
    }

    public Boolean getCastrado() {
        return this.castrado;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    // MÉTODOS
    public String toString() {
        return "Nome: " + this.nome + "\nIdade: " + this.idade + " anos\nRaça: " + this.raca + "\nDono: " + this.dono
                + "\nCastrado: " + this.castrado + "\nPeso: " + this.peso + "kg";
    }
}
