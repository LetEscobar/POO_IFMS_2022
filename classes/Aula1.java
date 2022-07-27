// package nome_diretório em que o arquivo se encontra
package classes;

// Classes devem ter a primeira letra maiúscula e as outras minúsculas
public class Aula1 {
    private int j = 0; // j é um atributo

    public static void main(String[] args) {
        int i = 0; // i é uma variável

        // doguinho é um OBJETO
        // Cachorro() é um constructor
        Cachorro doguinho = new Cachorro();
    }

    private void soma(int a, int b) {
        int i = 2; // i é valor do método soma
        int soma = a + b + i + j;
    }
}
