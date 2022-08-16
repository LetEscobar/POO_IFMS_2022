import java.time.LocalDate;

public class Autor extends Pessoa {
    private String formacao;
    private int quantidadeLivros; // nunca armazenar isso

    public Autor(String nome, LocalDate dataNascimento, String endereco, String formacao, int i) {
        super(nome, dataNascimento, endereco);
        this.formacao = formacao;
        this.quantidadeLivros = i;
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
