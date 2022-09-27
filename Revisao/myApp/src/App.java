import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Funcionario funcionarioScanner = Funcionario.lerFuncionario();

        // Instanciando um objeto da classe Estudante:
        // nomeClasse nome-objeto = new construtor();
        // new: operador interno responsável por alocar a memória
        Estudante objetoEstudante = new Estudante("12345678", "Letícia");
        objetoEstudante.setCurso("Análise e Desenvolvimento de Sistemas");
        objetoEstudante.setDataNascimento(LocalDate.of(2001, 01, 22));

        Funcionario objetoFuncionario = new Funcionario("123654", "João");
        objetoFuncionario.setDataNascimento(LocalDate.of(1999, 12, 23));

        Autor objetoAutor = new Autor("Sergio Furgeri", (LocalDate.of(2018, 6, 18)));
        objetoAutor.setQuantidadeDeLivros(5);
        objetoAutor.setAreaDeEstudo("Computação");

        Livro objetoLivro = new Livro("Programação Orientada a Objetos",
                objetoAutor);
        objetoLivro.setAnoLancamento(2018);
        objetoLivro.setEditora("Érica; 1ª edição");
        objetoLivro.setNumeroPaginas(264);

        Emprestimo objetoEmprestimo = new Emprestimo(objetoLivro, objetoFuncionario,
                objetoEstudante);
        objetoEmprestimo.setDataEmprestimo(LocalDate.of(2022, 05, 15));
        objetoEmprestimo.setDataEmprestimo(LocalDate.of(2022, 05, 30));

        System.out.println();
        System.out.println("\n---------------------------------------------");
        System.out.println("\t\tNOTA DE EMPRÉSTIMO DO LIVRO:");
        System.out.print("---------------------------------------------");
        System.out.println(objetoEmprestimo);
        System.out.println("\n---------------------------------------------");
        System.out.println("\t\tDADOS DO AUTOR DO LIVRO:");
        System.out.println("---------------------------------------------");
        System.out.println(objetoAutor);
        System.out.println("---------------------------------------------");
    }
}
