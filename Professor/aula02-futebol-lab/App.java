import java.time.LocalDate;

public class App {
    public static void main(String[] args)
    {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");
        Time vasco = new Time("Vasco");

        UnidadeDaFederacao rj = new UnidadeDaFederacao("Rio de Janeiro", "RJ");
        Cidade rio = new Cidade("Rio de Janeiro", rj);
        Cidade campos = new Cidade("Campos dos Goytacazes", rj);

        fla.setCidadeSede(rio);

        UnidadeDaFederacao es = new UnidadeDaFederacao("Espírito Santo", "ES");
        Cidade cariacica = new Cidade("Cariacica", es);

        Partida p1 = new Partida(fla,flu,LocalDate.of(2022, 9, 14),cariacica);

        p1.marcaGolTimeA();

        System.out.println(p1.getTimeA().getNome()+
            " oriundo de "+p1.getTimeA().getCidadeSede().getUf().getSigla()+
            " marcou "+p1.getGolsTimeA()+" gols.");
        System.out.println(p1.getTimeB().getNome()+" marcou "+p1.getGolsTimeB()+" gols.");
        System.out.println(p1.getData());
    }
}
