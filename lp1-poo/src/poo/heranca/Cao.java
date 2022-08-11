package poo.heranca;

public class Cao extends AnimalTerrestre {

    public Cao() {
        super();
    }

    @Override
    // polimorfismo
    public void emitirSom() {
        System.out.println("auau");
    }

}