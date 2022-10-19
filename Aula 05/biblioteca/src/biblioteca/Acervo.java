package biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Acervo {
    private Map<Integer,Livro> Livros = new HashMap<>();
    private int num;

    
    public Livro registraLivro(String nome, String autor, int anoPublicação){
        int id;
        id = this.num;
        this.num++;
        Livro NovoLivro = new Livro(id, nome, autor, anoPublicação);
        this.Livros.put(id, NovoLivro);
        return NovoLivro;
    }

    public void veLista(){
        System.out.printf("Informações do Acervo:\nNumero de livros registrados: %d\nLivros:\n",this.Livros.size());
        for(Livro l: Livros.values()){
            System.out.print(l.getInfo());
        }
    }

    public Livro removeLivro(int Id){
        Livro livroRemovido = Livros.get(Id);
        Livros.remove(Id);
        return livroRemovido;
    }

    public void veDetalhes(int Id){
        System.out.print(Livros.get(Id).toString());
    }



}
