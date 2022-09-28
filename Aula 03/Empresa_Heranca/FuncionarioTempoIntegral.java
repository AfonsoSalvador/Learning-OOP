public class FuncionarioTempoIntegral extends Funcionario{

    public FuncionarioTempoIntegral(String nome, float salário) {
        super(nome, salário);
    }

    @Override
    public String toString() {
        return super.toString()+"\n";
    }
}