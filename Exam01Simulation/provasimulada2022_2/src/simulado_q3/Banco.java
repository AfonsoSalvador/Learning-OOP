package simulado_q3;

import java.util.LinkedList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        agencias = new LinkedList<Agencia>();
    }

    public Agencia criaAgencia(String nome){
        Agencia novaFilial = new Agencia(nome);
        agencias.add(novaFilial);
        return novaFilial;
    }

    @Override
    public String toString() {
        String output;
        output = "Nome do Banco: " + nome;

        for(Agencia a : agencias){
            output = output + "\n" + a.toString();
        }

        return output;
    }



    
}
