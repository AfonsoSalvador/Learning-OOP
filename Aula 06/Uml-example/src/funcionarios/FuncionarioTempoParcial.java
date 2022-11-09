package funcionarios;

import predio.Sala;

public class FuncionarioTempoParcial extends Funcionario{
    
    private int HorasSemanais=0;

    public FuncionarioTempoParcial(String nome, int cpf, String Nascimento, float salário, Sala salaocupada,
            int horasSemanais) {
        super(nome, cpf, Nascimento, salário, salaocupada);
        HorasSemanais = horasSemanais;
    }

    public int getHorasSemanais() {
        return HorasSemanais;
    }

    public void setHorasSemanais(int HorasSemanais) {
        this.HorasSemanais = HorasSemanais;
    }

    @Override
    public String toString(){
        return super.toString()+"\tHoras Semanais:"+getHorasSemanais()+ " Horas\n";
    }

    
}