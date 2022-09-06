package poo.heranca_exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimo {
    private Estudante estudante;
    private Funcionario servidor;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public static ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    // ---------------------------- Métodos ----------------------------
    // Construtor:
    public Emprestimo() {
        Scanner inString = new Scanner(System.in);

        System.out.println("Digite o nome do estudante que deseja realizar o empréstimo:");
        // String nome = inString.nextLine();

        // private Estudante estudante;
        // private Funcionario servidor;
        // private Livro livro;
        // private LocalDate dataEmprestimo;
        // private LocalDate dataDevolucao;
    }

    // ------------------ Métodos Getters and Setters ------------------
    public static ArrayList<Emprestimo> getEmprestimo() {
        return emprestimos;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Funcionario getServidor() {
        return this.servidor;
    }

    public void setServidor(Funcionario servidor) {
        this.servidor = servidor;
    }

    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

}
