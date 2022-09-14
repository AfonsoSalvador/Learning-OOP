import java.time.LocalDate;

public class Partida {
    private Time timeA;
    private Time timeB;
    private LocalDate data; 
    private int golsTimeA = 0;
    private int golsTimeB;
    private Cidade cidadeDeRealizacao;

    public void marcaGolTimeA()
    {
        golsTimeA++;
    }
    public void marcaGolTimeB()
    {
        golsTimeB++;
    }
    public int getGolsTimeA()
    {
        return golsTimeA;
    }
    public int getGolsTimeB()
    {
        return golsTimeB;
    }

    public Partida(Time timeA, Time timeB, LocalDate data, Cidade cidadeDeRealizacao)
    {
        this.timeA = timeA;
        this.timeB = timeB;
        this.data = data;
        this.cidadeDeRealizacao = cidadeDeRealizacao;
    }
    public LocalDate getData() {
        return data;
    }
    public Time getTimeA() {
        return timeA;
    }
    public Time getTimeB() {
        return timeB;
    }
    
}
