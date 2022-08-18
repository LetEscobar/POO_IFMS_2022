package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.Month;

public class testeExHeranca {
    public static void main(String[] args) {
        // Objeto autor
        // LocalDate dataNascimento = LocalDate.of(2001, Month.JANUARY, 22);
        // Autor leticia = new Autor("Letícia", dataNascimento, "Três Lagoas", "TADS",
        // 2);

        // Objeto livro POO
        LocalDate dataLancamentoPOO = LocalDate.of(2022, Month.AUGUST, 15);
        Livro LivroPOO = new Livro("Programando em POO");
        LivroPOO.setEditora("Editora Erica");
        LivroPOO.setDataLancamento(dataLancamentoPOO);

        // Objeto livro JS
        LocalDate dataLancamentoJS = LocalDate.of(2021, Month.DECEMBER, 23);
        Livro LivroJS = new Livro("Programando em JS");
        LivroJS.setEditora("Editora Westminster");
        LivroJS.setDataLancamento(dataLancamentoJS);

        // Objeto funcionário
        LocalDate dataNascimentoFunc = LocalDate.of(2001, Month.JANUARY, 22);
        Funcionario func = new Funcionario();
        func.setNome("Letícia");
        func.setEndereco("Rua x");
        func.setDataNascimento(dataNascimentoFunc);
        func.setCargo("Programadora");
        func.setMatricula("123456");

        // Objeto estudante
        Estudante estudante1 = new Estudante();
        estudante1.setNome("Beto");
        estudante1.setEndereco("Rua y");
        LocalDate dataNascimentoEstudante1 = LocalDate.of(2001, Month.JANUARY, 8);
        estudante1.setDataNascimento(dataNascimentoEstudante1);
        estudante1.setRa("46789");
        estudante1.setCurso("Computação");
        LocalDate dataInicio = LocalDate.of(2001, Month.FEBRUARY, 8);
        estudante1.setDataInicio(dataInicio);

        // Objeto empréstimo
        Emprestimo emprestimo1 = new Emprestimo();
        emprestimo1.setEstudante(estudante1);
        emprestimo1.setServidor(func);
        emprestimo1.setLivro(LivroPOO);
        LocalDate dataEmprestimo = LocalDate.of(2022, Month.AUGUST, 16);
        emprestimo1.setDataEmprestimo(dataEmprestimo);
        LocalDate dataDevolucao = LocalDate.of(2022, Month.AUGUST, 25);
        emprestimo1.setDataDevolucao(dataDevolucao);
    }
}
