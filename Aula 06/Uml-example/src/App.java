import funcionarios.*;
import predio.*;

public class App {


    public static void main(String[] args) throws Exception {
        Empresa emp = new Empresa("EpFather");

        FuncionarioTempoIntegral JoaoFI = new FuncionarioTempoIntegral("João", 49879863, "04/03/1997", 7652, null);
        emp.addFuncionario(JoaoFI);
        FuncionarioTempoIntegral MariaFI = new FuncionarioTempoIntegral("Maria", 69559822, "25/06/1989", 8623, null);
        emp.addFuncionario(MariaFI);

        Sala s803 = new Sala(803, 1);
        emp.addSala(s803);
        Sala s421 = new Sala(421, 1);
        emp.addSala(s421);
        Sala s644 = new Sala(644, 1);
        emp.addSala(s644);

        
        JoaoFI.TrocaDeSalaocupada(s803);
        
        MariaFI.TrocaDeSalaocupada(s421);
        
        JoaoFI.TrocaDeSalaocupada(s644);
        
        MariaFI.TrocaDeSalaocupada(s644);


        System.out.println(emp.toString());

    }
}
