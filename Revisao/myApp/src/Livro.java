public class Livro {
    private String titulo;
    private int anoLancamento;
    private String editora;
    private int numeroPaginas;
    private Autor autor;

    // Construtor
    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // toString - para exibir os dados na tela
    public String toString() {
        return "Título: " + this.titulo +
                "\nAutor: " + this.autor.getNome() +
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
}