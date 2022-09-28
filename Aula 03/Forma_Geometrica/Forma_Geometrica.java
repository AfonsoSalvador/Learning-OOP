public abstract class Forma_Geometrica {
    
    abstract double getPerimetro();

    abstract double getArea();

    @Override
    public String toString() {
        return "\tÁrea: "+ String.format("%.2f",getArea())+ "\n\tPerimetro: "+ String.format("%.2f",getPerimetro()) +"\n\n";
    }
    
    
}
