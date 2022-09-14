public class Time{
    private String nome;
    private Estadio estadio;
    

    public Time(String nome, Estadio estadio) {
        this.nome = nome;
        this.estadio = estadio;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public String getNome() {
        return nome;
    }

    


}