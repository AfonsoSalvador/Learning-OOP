import java.time.LocalDate;
import java.util.Random;


public class Partida {


    private Time timeA;
    private Time timeB;
    private int placarA;
    private int placarB;
    private int ingressosVendidos;
    private Estadio estadio;
    private LocalDate data;

    
    public Partida(Time timeA, Time timeB, Estadio estadio, LocalDate data) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.estadio = estadio;
        this.data = data;
        this.placarA = 0;
        this.placarB = 0;
        this.ingressosVendidos=0;

        
    }

    public Time getTimeA() {
        return timeA;
    }
   
    public Time getTimeB() {
        return timeB;
    }

    public int getPlacarA() {
        return placarA;
    }

    public void setPlacarA(int placarA) {
        this.placarA = placarA;
    }

    public int getPlacarB() {
        return placarB;
    }

    public void setPlacarB(int placarB) {
        this.placarB = placarB;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }
    public Estadio getEstadio() {
        return estadio;
    }


    public LocalDate getData() {
        return data;
    }

    public void comecaPartida(){
        Random aleatorizador = new Random();
        this.placarA = aleatorizador.nextInt(5);
        this.placarB = aleatorizador.nextInt(5);

        this.ingressosVendidos=(this.estadio.getCapacidade()*(aleatorizador.nextInt(5)+5))/10;
        
    }


    
}
