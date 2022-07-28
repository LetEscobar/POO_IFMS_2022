// Classes devem ter a primeira letra maiúscula e as outras minúsculas
public class Aula1 {

    public static void main(String[] args) {
        // Estou criando um onjeto do tipo Cachorro, chamado doguinho
        // Estou instanciado através do operador new
        // Após o new eu chamo o construtor da classe
        Cachorro doguinho = new Cachorro("doguinho");

        doguinho.setNome("Rex");
        doguinho.setIdade(7);
        doguinho.setRaca("Caramelo");
        doguinho.setDono(true);
        doguinho.setCastrado(false);
        doguinho.setPeso(7.3);

        // System.out.println(doguinho.getNome());
        // System.out.println(doguinho.getIdade());
        // System.out.println(doguinho.getRaca());
        // System.out.println(doguinho.getDono());
        // System.out.println(doguinho.getCastrado());
        // System.out.println(doguinho.getPeso());

        System.out.println(doguinho.toString());

        // Cachorro toto = new Cachorro();
        // toto.setNome("Thor");
        // toto.setIdade(9);
        // toto.setRaca("Pit Bull");
        // toto.setDono(false);
        // toto.setCastrado(true);
        // toto.setPeso(11.8);
    }
}
