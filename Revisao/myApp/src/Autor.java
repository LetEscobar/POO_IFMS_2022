import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Autor extends Pessoa {
    private int quantidaDeLivros;
    private String areaDeEstudo;

    // Construtor
    public Autor(String nomeAutor, LocalDate dataNascimentoConstrutor) {
        this.nome = nomeAutor;
        this.dataNascimento = dataNascimentoConstrutor;
    }

    // toString - para exibir os dados na tela
    public String toString() {
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome +
                "\nQuantidade de livros publicados: " + this.quantidaDeLivros +
                "\nÁrea de estudos: " + this.areaDeEstudo +
                "\nData de nascimento: " + this.dataNascimento.format(formatDate);
    }

    // Getters and Setters
    public int getQuantidadeDeLivros() {
        return this.quantidaDeLivros;
    }

    public void setQuantidadeDeLivros(int _quantidadeDeLivros) {
        this.quantidaDeLivros = _quantidadeDeLivros;
    }

    public String getAreaDeEstudo() {
        return this.areaDeEstudo;
    }

    public void setAreaDeEstudo(String _areaDeEstudo) {
        this.areaDeEstudo = _areaDeEstudo;
    }
}