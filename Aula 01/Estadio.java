import java.time.LocalDate;

public class Estadio {
    String nome;
    String cidade;
    int capacidade;
    LocalDate inauguração;
    
    public Estadio(String nome, String cidade, int capacidade, LocalDate inauguração) {
        this.nome = nome;
        this.cidade = cidade;
        this.capacidade = capacidade;
        this.inauguração = inauguração;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public LocalDate getInauguração() {
        return inauguração;
    }

    
}
