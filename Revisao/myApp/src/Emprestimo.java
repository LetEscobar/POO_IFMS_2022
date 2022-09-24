import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    // Atributos criados a partir de uma classe, vão virar objetos
    private Livro livro;
    private Funcionario funcionario;
    private Estudante estudante;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Construtor
    public Emprestimo(Livro _livro, Funcionario _funcionario, Estudante _estudante) {
        this.livro = _livro;
        this.funcionario = _funcionario;
        this.estudante = _estudante;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = LocalDate.now();
    }

    // toString - para exibir os dados na tela
    public String toString() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "\nData de retirada: " + this.dataEmprestimo.format(formatDate) +
                "\nData de devolução: " + this.dataDevolucao.format(formatDate) +
                "\n---------------------------------------------" +
                "\nDados do livro: \n" + this.livro +
                "\n---------------------------------------------" +
                "\nDados do estudante:\n" + this.estudante +
                "\n---------------------------------------------" +
                "\nDados do funcionário responsável:\n" + this.funcionario;
    }

    // Getters and setters
    public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Estudante getEstudante() {
        return this.estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
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