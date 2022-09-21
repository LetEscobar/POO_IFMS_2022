package poo.heranca_exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Autor extends Pessoa {
    private String formacao;
    private int quantidadeLivros;

    private static ArrayList<Autor> autores = new ArrayList<Autor>();

    // ---------------------------- Métodos ----------------------------

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nFormação do autor: " + this.formacao +
                "\nQuantidade de livros publicados: " + this.quantidadeLivros);
    }

    // Construtor
    public Autor() {
        super();

        Scanner inString = new Scanner(System.in);
        Scanner inInt = new Scanner(System.in);

        System.out.print("Digite a formação do autor: ");
        this.formacao = inString.nextLine();

        System.out.print("Digite a quantidade de livros escritos pelo autor: ");
        this.quantidadeLivros = inInt.nextInt();
    }

    // ------------------ Métodos Getters and Setters ------------------
    public static ArrayList<Autor> getAutor() {
        return autores;
    }

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
