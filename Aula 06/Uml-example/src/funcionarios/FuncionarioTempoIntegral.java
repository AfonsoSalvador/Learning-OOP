package funcionarios;

import predio.Sala;

public class FuncionarioTempoIntegral extends Funcionario{


    

    public FuncionarioTempoIntegral(String nome, int cpf, String Nascimento, float salário, Sala salaocupada) {
        super(nome, cpf, Nascimento, salário, salaocupada);
    }

    @Override
    public String toString() {
        return super.toString()+"\n";
    }
}