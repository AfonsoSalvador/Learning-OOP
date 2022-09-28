import java.util.LinkedList;

public class Empresa {
    private LinkedList<Departamento> departamentos = new LinkedList<Departamento>();
    private String nome;

     

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void addDepartamento(Departamento d){
        departamentos.add(d);
    }

    public void removeDepartamento(Departamento d){
        departamentos.remove(d);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Departamento> getDepartamentosEmpresa(){
        return new LinkedList<Departamento>(departamentos);
    }

    public float GetCustoEmpresa(){
        float custo = 0;
        for(Departamento d : departamentos){
            custo += d.getCusto();
        }
        return custo;
    } 

    public int getNumFuncionarios(){
        int numero=0;
        for(Departamento d : departamentos){
            numero += d.getNumFuncionarios();
        }
        return numero;

    }

    public float getSalarioMedio(){
        return GetCustoEmpresa()/getNumFuncionarios();
    }

    /**
     * Aumenta o salário de todos os funcionários da empresa
     * 
     * @param p utilizar a formatação comum de porcentagem (ex: para 10% de aumento, utilize aumentaSalario(10))
     * 
     */
    public void aumentaSalario(float p){
        for(Departamento d: departamentos){
            d.aumentaSalarioDepartamento(p);
        }
    }


}
