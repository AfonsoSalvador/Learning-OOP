import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Forma_Geometrica> formas = new LinkedList<>();

        formas.add(new Circulo(4));
        formas.add(new Quadrado(3.0, 2.0));
        formas.add(new Triangulo(3.0, 4.0, 5.0));

        
        for(Forma_Geometrica f : formas){
            System.out.print(f.toString());
        }
    }
}
