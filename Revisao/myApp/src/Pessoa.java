import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected LocalDate dataNascimento;

    // Getters and Setters
    public String getNome(){
        return this.nome;
    }

    public void setAreaDeEstudo(String _nome){
        this.nome = _nome;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate _dataNascimento){
        this.dataNascimento = _dataNascimento;
    }
}