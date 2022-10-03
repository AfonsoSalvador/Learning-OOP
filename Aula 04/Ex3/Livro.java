public class Livro extends Produto{
    String Autor;

    public Livro(String nome, double preço, String autor) {
        super(nome, preço);
        Autor = autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    
}
