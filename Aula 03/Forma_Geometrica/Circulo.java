public class Circulo extends Forma_Geometrica{
    Double raio;
    
    Circulo(double raio){
        this.raio=raio;
        return;
    }

    @Override
    double getArea() {
        return Math.pow(raio,2)*Math.PI;
    }

    @Override
    double getPerimetro() {
        return 2*Math.PI*raio;
    }
    
    @Override
    public String toString() {
        return "Círculo:\n"+super.toString();
    }
}
