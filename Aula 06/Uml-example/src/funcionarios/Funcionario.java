package funcionarios;

import predio.*;

public class Funcionario extends Pessoa{
    private float salário;
    private Sala salaocupada;
    
    

    public Funcionario(String nome, int cpf, String Nascimento, float salário, Sala salaocupada) {
        super(nome, cpf, Nascimento);
        this.salário = salário;
        this.salaocupada = salaocupada;
        if(salaocupada!=null){
            salaocupada.insereFuncionarioSala(this);
        }
    }

    public String getNome() {
        return super.getNome();
    }
    public void setNome(String nome) {
        super.setNome(nome);
    }
    public float getSalário() {
        return salário;
    }
    public void setSalário(float salário) {
        this.salário = salário;
    }

    public Sala getSalaocupada() {
        return salaocupada;
    }

    public void TrocaDeSalaocupada(Sala salaocupada) {
        if(salaocupada.ehCheia()){
            return;
        }

        if(this.salaocupada!=null){
            this.salaocupada.removeFuncionarioSala(this.getNome());
        }

        this.salaocupada = salaocupada;
        salaocupada.insereFuncionarioSala(this);
    }

    public String toString(){
        String s;
        s = super.toString()+ " \n\tSala : " + this.getSalaocupada().getNumero()+" \n\tSalário : R$" + this.getSalário()+"\n";
        return s;
    }

    /**
     * Aumenta o salário do funcionario
     * 
     * @param p utilizar a formatação comum de porcentagem (ex: para 10% de aumento, utilize aumentaSalario(10))
     * 
     */
    public void aumentaSalario(float p){
        setSalário(getSalário()+(getSalário()*(p/100)));
    }
    
}
