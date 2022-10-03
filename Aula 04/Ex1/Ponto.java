public class Ponto {
    private double x;
    private double y;

    

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(String x, String y){      
        this.x=Double.parseDouble(x);
        this.y=Double.parseDouble(y);
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getDistPontos(Ponto ponto){
        return Math.sqrt(Math.pow((ponto.x-this.x), 2)+Math.pow((ponto.y-this.y), 2));
    }

    
}

