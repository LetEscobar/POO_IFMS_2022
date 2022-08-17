package poo.heranca_exercicio;


import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dataLancamento;

    // construtor para obrigar a cria��o de t�tulo do livro
    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public LocalDate getDataLancamento() {
        return this.dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Título:" + this.titulo;
    }

}
