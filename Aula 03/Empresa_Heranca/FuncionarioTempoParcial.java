public class FuncionarioTempoParcial extends Funcionario{
    
    private int HorasSemanais=0;

    public FuncionarioTempoParcial(String nome, float salario, int HorasSemanais){
        super(nome,salario);
        this.HorasSemanais=HorasSemanais;

        return;
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