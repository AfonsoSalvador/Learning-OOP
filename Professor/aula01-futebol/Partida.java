import java.time.LocalDate;

public class Partida {
    private Time timeA;
    public Time getTimeA() {
        return timeA;
    }
    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }
    private Time timeB;
    public Time getTimeB() {
        return timeB;
    }
    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }
    private LocalDate data;
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
}
