import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        // Instanciando um objeto da classe Estudante:
        // nomeClasse nome-objeto = new construtor();
        // new: operador interno responsável por alocar a memória
        Estudante objeto1 = new Estudante("12345678", "Letícia");
        objeto1.setCurso("Análise e Desenvolvimento de Sistemas");
        objeto1.setDataNascimento(LocalDate.of(2001, 01, 22));

        Funcionario funcionario1 = new Funcionario("123", "Beto");
        funcionario1.setDataNascimento(LocalDate.of(1999,12,23));
        
        Autor objetoUmAutor = new Autor("Ana Luiza", (LocalDate.of(2022, 2, 22)));
        objetoUmAutor.setQuantidadeDeLivros(5);
        objetoUmAutor.setAreaDeEstudo("Biologicas");

        Livro objetoUmLivro = new Livro();
        objetoUmLivro.setTitulo("Programando em JAVA");
        objetoUmLivro.setAnoLancamento(2020);
        objetoUmLivro.setEditora("Editora XVV");
        objetoUmLivro.setNumeroPaginas(234);
        objetoUmLivro.setAutor(objetoUmAutor);

        System.out.println("DADOS DO ESTUDANTE:\n" + objeto1);
        System.out.println("\nDADOS DO FUNCIONÁRIO:\n" + funcionario1);
        System.out.println("\nDADOS DO AUTOR:\n" + objetoUmAutor);
        System.out.println("\nDADOS DO LIVRO:\n" + objetoUmLivro);
    }
}
