import java.util.*;

public class Quadrado extends Forma_Geometrica{
    List<Double> lados = new LinkedList<>();

    public Quadrado(Double l1, Double l2) {
        this.lados.add(l1);
        this.lados.add(l2);

        return;
    }

    @Override
    double getArea() {
        return lados.get(0)*lados.get(1);
    }

    @Override
    double getPerimetro() {
        double p=0;
        for(double l: lados){
            p+=l;
        }
        return p*2;
    }

    @Override
    public String toString() {
        return "Quadrado:\n"+super.toString();
    }
}
