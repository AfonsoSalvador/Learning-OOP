package predio;

import java.util.LinkedList;

import funcionarios.Funcionario;

public class Sala {
    private int numero;
    private LinkedList<Funcionario> ocupantes;
    private int ocupação_maxima;


    public Sala(int numero, int ocupação_maxima) {
        this.numero = numero;
        this.ocupantes = new LinkedList<Funcionario>();
        this.ocupação_maxima = ocupação_maxima;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }


    public void insereFuncionarioSala(Funcionario funcionario){
        
        if((this.ocupantes.size()+1>this.ocupação_maxima)||(funcionario.getSalaocupada()==null)){
            System.out.printf("\tocupação máxima atingida ou ja pertence a uma sala!\n\ttente com outra sala ou remova um funcionario\n");
            return;
        }
        this.ocupantes.add(funcionario);   
    }


    public int getOcupação_maxima() {
        return ocupação_maxima;
    }


    public void setOcupação_maxima(int ocupação_maxima) {
        this.ocupação_maxima = ocupação_maxima;
    }

    public Funcionario removeFuncionarioSala(String nome){
        Funcionario funcionario;
        int index =0;

        for(Funcionario f : ocupantes){
            if(f.getNome()==nome){
                funcionario=ocupantes.remove(index);
                return funcionario;
            }
            index++;
        }
        
        return null;
    }
    
    public Boolean ehCheia(){
        if(this.ocupantes.size()==this.ocupação_maxima){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        
        String s = "\n\tNumero: " + this.getNumero() + "\n\tOcupantes:\n";

        for(Funcionario f : ocupantes){
            s = s + "\t\tNome: " + f.getNome() + "\n";
        }

        return s;

    }
}
