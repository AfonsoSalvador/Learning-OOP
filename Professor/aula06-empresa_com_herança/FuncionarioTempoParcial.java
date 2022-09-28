public class FuncionarioTempoParcial extends Funcionario {
    private int numeroHorasSemanais=20;

    @Override
    public int getNumeroHorasSemanais() {
        return numeroHorasSemanais;
    }

    public void setNumeroHorasSemanais(int numeroHorasSemanais) {
        this.numeroHorasSemanais = numeroHorasSemanais;
    }

}

