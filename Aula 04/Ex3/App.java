import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Produto> lista = new LinkedList<>();

        Livro l1 = new Livro("Harry Potter e o Prisioneiro de Askaban", 27.5, "J. K. Rolando");
        Livro l2 = new Livro("Os Garotos Corvos", 32, "Maggie Stifvater");
        Livro l3 = new Livro("Percy Jackson e o Ladrão de Raios", 21, "Rick Riordan");
        Livro l4 = new Livro("Calculo II Sexta Edição Volume 2", 150, "James Stewart");

        BoardGame b1 = new BoardGame("Carcassone", 100, 15);
        BoardGame b2 = new BoardGame("Coup", 57, 12);
        BoardGame b3 = new BoardGame("Magic The Gathering", 20, 8);

        lista.add(l1);
        lista.add(l2);
        lista.add(l3);
        lista.add(l4);
        lista.add(b1);
        lista.add(b2);
        lista.add(b3);

        for(Produto p : lista){
            System.out.println(p.toString());
        }


    }
}
