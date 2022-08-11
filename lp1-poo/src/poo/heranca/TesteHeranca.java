package poo.heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        Cao bilu = new Cao();
        bilu.setNome("bilu");
        bilu.setIdade(4);
        bilu.setRaca("maltes");

        Dono leticia = new Dono();
        leticia.setNome("Letícia");
        leticia.setEndereco("Rua X, 123");
        leticia.setAnimal(bilu);

        leticia.getAnimal().emitirSom();
        leticia.alimentarAnimal(bilu);
        leticia.andar();

        Funcionario beto = new Funcionario();
        beto.setMatricula(123456);
        beto.toString();
    }
}
