import java.util.*;

public class Triangulo extends Forma_Geometrica{

    List<Double> lados = new LinkedList<>();

    public Triangulo(Double l1, Double l2, Double l3) {
        this.lados.add(l1);
        this.lados.add(l2);
        this.lados.add(l3);
        return;
    }

    @Override
    double getArea() {
        double sp = getPerimetro()/2;

        double part1 = 1;

        for(double l : lados){
            part1*=(sp-l);
        }

        return Math.sqrt(sp*part1);
    }

    @Override
    double getPerimetro() {
        double p=0;
        for(double l : lados){
            p+=l;
        }
        return p;
    }

    @Override
    public String toString() {
        return "Triangulo:\n"+super.toString();
    }   
}
