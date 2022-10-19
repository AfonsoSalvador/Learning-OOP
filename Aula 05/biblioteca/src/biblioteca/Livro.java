package biblioteca;

public class Livro{
    private int id;
    private String nome;
    private String autor;
    private int anoPublicação;

    
    public Livro(int id, String nome, String autor, int anoPublicação) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicação() {
        return anoPublicação;
    }

    @Override
    public String toString() {
        return "\tNome:" + this.getNome() + "\n\tAutor:" + this.getAutor() + "\n\tAno de Publicação:" + this.getAnoPublicação() + "\n\tID: " + this.getId() + "\n";
    }

    public String getInfo(){
        return "\t Nome:" + this.getNome() +"\n\tID: " + this.getId() + "\n\n";
    }
    

}