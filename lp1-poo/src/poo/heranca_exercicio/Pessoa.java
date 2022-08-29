package poo.heranca_exercicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String endereco;

    // construtor default: só existe para poder gerar instância em estudante e
    // funcionário
    protected Pessoa() {
    }

    // construtor obrigatório para gerar instância de Autor
    protected Pessoa(String _nome, LocalDate _dataNascimento, String _endereco) {
        this.nome = _nome;
        this.endereco = _endereco;
        this.dataNascimento = _dataNascimento;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Outros métodos

    public String toString() {
        return ("Nome: " + this.nome +
                "\nData de nascimento: " + this.dataNascimento +
                "\nEndereço: " + this.endereco);
    }

    public Pessoa cadastrarPessoa() {

        Scanner in = new Scanner(System.in);

        // Nome:
        System.out.print("Digite o nome: ");
        String nome = in.nextLine();
        this.nome = nome;

        // Endereço:
        System.out.print("Digite o endereço: ");
        String endereco = in.nextLine();
        this.endereco = endereco;

        // Data de nascimento:
        System.out.print("Digite a data de nascimento (dd/mm/yyyy): ");
        String dataNascimento = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate novaDataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.dataNascimento = novaDataNascimento;

        return null;
    }
}
