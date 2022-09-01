package poo.heranca_exercicio;

import java.time.LocalDate;
import java.util.Scanner;

public class Autor extends Pessoa {
    private String formacao;
    private int quantidadeLivros;

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

    // -------------------------- Outros métodos --------------------------

    // Construtor:
    public Autor(String nome, LocalDate dataNascimento, String endereco, String formacao, int quantidade) {
        super(nome, dataNascimento, endereco);
        this.formacao = formacao;
        this.quantidadeLivros = quantidade;
    }

    // Exibir dados:
    public String toString() {
        return (super.toString() +
                "\nFormação do autor: " + this.formacao +
                "\nQuantidade de livros publicados: " + this.quantidadeLivros);
    }

    // Cadastrar estudante:
    public Autor cadastrarAutor() {

        Autor novoAutor = new Autor(nome, dataNascimento, endereco, formacao, quantidade);

        // Nome, endereço e data de nascimento:
        novoAutor.cadastrarPessoa();

        Scanner in = new Scanner(System.in);

    }

}
