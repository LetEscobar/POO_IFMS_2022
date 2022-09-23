import java.time.LocalDate;

public class Emprestimo {
    // Atributos criados a partir de uma classe, vão virar atributos
    private Livro livro;
    private Funcionario funcionario;
    private Estudante estudante;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo (Livro _livro, Funcionario _funcionario, Estudante _estudante){
        this.livro = _livro;
        this.funcionario = _funcionario;
        this.estudante = _estudante;
        this.dataEmprestimo = LocalDate.now();
    }

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