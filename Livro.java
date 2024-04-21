public class Livro extends Produto {
    private String autor;
    private int numPaginas;

    public Livro(String nome, double preco, int quantidade, String autor, int numPaginas) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Número de Páginas: " + numPaginas;
    }
}
