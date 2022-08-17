package poo.heranca_exercicio;
import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;
    protected String endereco;

    // construtor default: s� existe para poder gerar inst�ncia em estudante e
    // funcion�rio
    protected Pessoa() {
    }

    // construtor obrigat�rio para gerar inst�ncia de Autor
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

}
