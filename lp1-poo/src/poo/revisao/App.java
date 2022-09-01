package poo.revisao;

public class App {
    public static void main(String[] args) {
        // Criando um objeto -> o operador new aloca memória para o objeto
        Residencial minhaCasa = new Residencial("Minha casa", true, 100);
        minhaCasa.setOcupada(true);
        minhaCasa.setValor(100);

        System.out.println(minhaCasa.getNome() + minhaCasa.getOcupada() + minhaCasa.getValor());
    }
}
