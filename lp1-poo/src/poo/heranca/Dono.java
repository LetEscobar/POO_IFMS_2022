package poo.heranca;

public class Dono extends Pessoa {
    private AnimalTerrestre animal;
    private int qtdAnimais = 0;

    public AnimalTerrestre getAnimal() {
        return this.animal;
    }

    public void setAnimal(AnimalTerrestre animal) {
        this.animal = animal;
    }

    public int getQtdAnimais() {
        return this.qtdAnimais;
    }

    public void setQtdAnimais(int qtdAnimais) {
        this.qtdAnimais = qtdAnimais;
    }

    // construtor da classe Dono:
    public Dono() {
        super(); // chama o construtor da superclasse
    }

    // Sobrecarga
    public void alimentarAnimal(Cao animal) {
        System.out.println("Estou alimentando o cão chamado" + animal.getNome());
    }

    public void alimentarAnimal(Gato animal) {
        System.out.println("Estou alimentando o gato chamado" + animal.getNome());
    }

    @Override
    public void andar() {
        this.passos += 2;
        System.out.println("Estou correndo...");
    }
}
