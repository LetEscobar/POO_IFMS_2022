package poo.heranca_exercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class Autor extends Pessoa {
    private String formacao;
    private int quantidadeLivros;

    // -------------------------- Outros métodos --------------------------

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nFormação do autor: " + this.formacao +
                "\nQuantidade de livros publicados: " + this.quantidadeLivros);
    }

    // Cadastrar estudante:
    public Autor() {
        super();
        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.print("Digite formacao: ");
        this.formacao = inString.nextLine();

        System.out.print("Digite a editora: ");
        this.quantidadeLivros = inInt.nextInt();
    }

    // ----------------------- Getters and Setters ------------------------
    public String getFormacao() {
        return this.formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getQuantidadeLivros() {
        return this.quantidadeLivros;
    }

    public void setQuantidadeLivros(int quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }
}
