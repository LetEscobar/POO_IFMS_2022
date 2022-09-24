public class Livro {
    private String titulo;
    private int anoLancamento;
    private String editora;
    private int numeroPaginas;
    private Pessoa pessoa;

    // Construtor
    public Livro(String titulo, Pessoa nomeAutor) {
        this.titulo = titulo;
        this.pessoa = nomeAutor;
    }

    // toString - para exibir os dados na tela
    public String toString() {
        return "Título: " + this.titulo +
                "\nAutor: " + this.pessoa.getNome() +
                "\nAno de lançamento: " + this.anoLancamento +
                "\nEditora: " + this.editora +
                "\nNúmero de páginas: " + this.numeroPaginas;
    }

    // Getters and setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}