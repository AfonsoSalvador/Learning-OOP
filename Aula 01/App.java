import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {

    public static void printPartida(Partida p){
        System.out.printf("------------------------------------------------\n");
        System.out.printf("%s X %s \n",p.getTimeA().getNome(),p.getTimeB().getNome());
        System.out.printf("Local : %s -- %s\n",p.getEstadio().getNome(),p.getEstadio().getCidade());


        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("Data : %s\n",p.getData().format(formatado));

        System.out.printf("Ingressos vendidos: %d / %d\n",p.getIngressosVendidos(),p.getEstadio().getCapacidade());

        System.out.printf("Placar atual : %d - %d\n",p.getPlacarA(),p.getPlacarB());
        if(p.getPlacarA()>p.getPlacarB()){
            System.out.printf("Ganhador: %s!\n\n",p.getTimeA().getNome());
        }
        else if(p.getPlacarA()<p.getPlacarB()){
            System.out.printf("Ganhador: %s!\n\n",p.getTimeB().getNome());
        }
        else{
            System.out.printf("Empate!\n\n");
        }
    }


    public static void main(String[] args) {
        Estadio maracanã = new Estadio("Maracanã", "Rio de Janeiro", 78838, LocalDate.of(1950,6,16));
        Estadio mineirão = new Estadio("Mineirão", "Belo Horizonte", 62000, LocalDate.of(1965,9,5));
        Estadio são_Januário = new Estadio("São Januário", "Rio de Janeiro", 21880, LocalDate.of(1927,4,21));

        Time fla = new Time("Flamengo", maracanã);
        Time cru = new Time("Cruzeiro", mineirão);
        Time vas = new Time("Vasco", são_Januário);
        
        Partida p1 = new Partida(fla, cru, fla.getEstadio() , LocalDate.of(2022,9,14));
        

        p1.comecaPartida();
        printPartida(p1);

        Partida p2 = new Partida(fla, vas, vas.getEstadio(), LocalDate.of(2022,10,15));

        p2.comecaPartida();
        printPartida(p2);
        
    }
    
}
