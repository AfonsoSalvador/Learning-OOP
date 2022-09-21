package primeiro_momento;
import java.util.LinkedList;

public class Pilha {
    
    private LinkedList<String> itens = new LinkedList<String>();


    public void empilha(String s){
        itens.addLast(s);
    }

    public String desempilha(){
        return itens.removeLast();
    }

    public int getTamanho(){
        return itens.size();
    } 

    public LinkedList<String> getLista(){
        return new LinkedList<String>(itens);
    }



}

