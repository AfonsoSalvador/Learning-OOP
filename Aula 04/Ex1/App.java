public class App {
    public static void main(String[] args) {
        if(args.length!=6){
            System.out.printf("Não há info suficiente!\nTente novamente!\n");
        }
        else{
            Ponto p1 = new Ponto(args[0], args[1]);
            Ponto p2 = new Ponto(args[2],args[3]);
            Ponto p3 = new Ponto(args[4],args[5]);

            Triangulo t1 = new Triangulo(p1, p2, p3);

            System.out.printf("O perímetro do triângulo é: %.02f\n",t1.getPerimetro());
        }
            

    }
}
