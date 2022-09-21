package exercicios;

public class MeuBanco {

    public static void main(String[] args) {
        ContaCorrente contaLeticia = new ContaCorrente(0, 500);
        contaLeticia.setNome("Leticia");
        contaLeticia.setNumAgencia(123);
        contaLeticia.setNumConta(456);

        contaLeticia.depositar(120);
        contaLeticia.depositar(75.20);

        contaLeticia.sacar(10000);
    }
}
