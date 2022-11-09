package predio;

import java.util.LinkedList;
import funcionarios.Funcionario;

public class Empresa {
    private LinkedList<Funcionario> funcionarios;
    private LinkedList<Sala> salas;
    private String nome;


    
    public Empresa(String nome) {
        this.nome = nome;
        this.salas = new LinkedList<Sala>();
        this.funcionarios = new LinkedList<Funcionario>();
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void addSala(Sala sala){
        salas.add(sala);
    }

    public Funcionario removeFuncionarioEmpresa(String nome){
        Funcionario funcionario;
        int index =0;

        for(Funcionario f : funcionarios){
            if(f.getNome()==nome){
                funcionario=funcionarios.remove(index);
                for(Sala s : salas){
                    s.removeFuncionarioSala(nome);
                }
                return funcionario;
            }
            index++;
        }
        
        return null;
    }




    public String getNomeEmpresa() {
        return nome;
    }
    public void setNomeEmpresa(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String str = "=====" + getNomeEmpresa() + "=====\n\n" + "\nFuncionarios:\n";

        for(Funcionario f : funcionarios){
            str = str + f.toString();
        }

        str = str + "\nSalas:";

        for(Sala s : salas){
            str = str + s.toString();
        }

        str = str + "====================================\n\n";
        return str;
    }
    
}
