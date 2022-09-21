import java.util.LinkedList;

public class Departamento {

    private LinkedList<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private String nomeDepartamento;
    
    
    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public int getNumFuncionarios() {
        return funcionarios.size();
    }
    
    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void addFuncionario(Funcionario f){
        funcionarios.add(f);
    }

    public void removeFuncionario(Funcionario f){
        funcionarios.remove(f);
    }

    public void removeFuncionario(int index){
        funcionarios.remove(index);
    }

    public String listaFuncionario(){
        return funcionarios.toString();
    }

    public float getCusto(){
        float custo = 0;
        for(Funcionario f : this.funcionarios){
            custo += f.getSalário();
        }
        return custo;
    }

    public String toString(){
        String s;
        s = "Departamento:"+ this.getNomeDepartamento()+" \n\tFuncionários:\n";
        for(Funcionario f : funcionarios){
            s += f.toString();
        }
        return s;
    }

    /**
     * Aumenta o salário de todos os funcionários do departamento
     * 
     * @param p utilizar a formatação comum de porcentagem (ex: para 10% de aumento, utilize aumentaSalario(10))
     * 
     */
    public void aumentaSalarioDepartamento(float p){
        for(Funcionario f: funcionarios){
            f.aumentaSalario(p);
        }
    }


}
