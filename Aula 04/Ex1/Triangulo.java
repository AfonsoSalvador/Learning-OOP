
public class Triangulo {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimetro(){
        double per=0;
        per += p1.getDistPontos(p2);
        per += p2.getDistPontos(p3);
        per += p3.getDistPontos(p1);        
        return per;
    }
 
}
