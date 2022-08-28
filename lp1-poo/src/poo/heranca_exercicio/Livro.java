package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dataLancamento;

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

    public LocalDate getdataLancamento() {
        return this.dataLancamento;
    }

    public void setdataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String toString() {
        return ("Título: " + this.titulo +
                "\nEditora: " + this.editora +
                "\nData de lançamento: " + this.dataLancamento);
    }

    public static Livro cadastrarLivro() {
        Scanner in = new Scanner(System.in);

        // Título do livro:
        System.out.print("Digite o título do livro: ");
        String titulo = in.next();
        if (titulo.length() < 2) {
            System.out.println("O título deve ter ao menos 2 caracteres!");
            return null;
        }
        Livro novoLivro = new Livro(titulo);

        // Editora do livro:
        System.out.print("Digite a editora do livro: ");
        novoLivro.setEditora(in.next());

        // Data de lancamento do livro:
        System.out.print("Digite a data de lançamento (dd/mm/yyyy): ");
        String data = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaData = LocalDate.parse(data, formatter);
        novoLivro.setdataLancamento(novaData);

        return novoLivro;
    }
}