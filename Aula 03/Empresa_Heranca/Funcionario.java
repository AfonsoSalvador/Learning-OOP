public class Funcionario {
    private String nome;
    private float salário;
    
    
    
    public Funcionario(String nome, float salário) {
         this.nome = nome;
         this.salário = salário;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalário() {
        return salário;
    }
    public void setSalário(float salário) {
        this.salário = salário;
    }
    
    public String toString(){
        String s;
        s = "\n\tNome :"+ this.getNome() + " \n\tSalário : R$" + this.getSalário()+ "\n";
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
