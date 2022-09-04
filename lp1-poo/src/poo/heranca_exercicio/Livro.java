package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private LocalDate dataLancamento;

    // -------------------------- Métodos --------------------------
    public String toString() {
        return ("Título: " + this.titulo +
                "\nEditora: " + this.editora +
                "\nData de lançamento: " + this.dataLancamento);
    }

    // Construtor:
    public Livro() {
        Scanner inString = new Scanner(System.in);

        System.out.print("Digite o título: ");
        this.titulo = inString.nextLine();

        System.out.print("Digite a editora: ");
        this.editora = inString.nextLine();

        System.out.print("Digite a data de lançamento (dd/mm/yyyy): ");
        String data = inString.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaData = LocalDate.parse(data, formatter);
        this.dataLancamento = novaData;
    }

    // Construtor para o exercício de collection:
    public Livro(String string) {
    }

    // ---------------- Métodos Getters and Setters -----------------
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
}