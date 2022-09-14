import java.time.LocalDate;

public class App {
    public static void main(String[] args)
    {
        Time v = new Time();
        Time fla = new Time();
        Time flu = new Time();
        v.setNome("Vasco");
        fla.setNome("Flamengo");
        flu.setNome("Fluminense");
        v.setCidadeSede("Rio de Janeiro");
        fla.setCidadeSede("Rio de Janeiro");
        flu.setCidadeSede("Rio de Janeiro");

        Partida p1 = new Partida();
        p1.setTimeA(v);
        p1.setTimeB(fla);
        p1.setData(LocalDate.of(2022, 9, 12));
    
        System.out.println(p1.getTimeA().getNome());
        System.out.println(p1.getTimeB().getNome());
        System.out.println(p1.getData());

    }
}
