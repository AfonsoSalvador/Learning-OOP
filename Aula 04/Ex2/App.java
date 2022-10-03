import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta("Afonso", 10);
        ContaPlus cp1 = new ContaPlus("Salvador", 10000);

        System.out.println(c1.toString());
        System.out.println(cp1.toString());

        System.out.printf("\n------------------------------\nDepositando 100 reais em Salvador\n------------------------------\n");
        cp1.depositaValor(100);

        System.out.println(cp1.toString());

        System.out.printf("\n---------------------------\nDepositando 4000 reais na conta de Afonso\n---------------------------\n");
        c1.depositaValor(4000);

        System.out.println(c1.toString());

        System.out.printf("\nSacando 200 reais de Salvador, com uma taxa de %.02f\n",cp1.sacaValor(200));

        System.out.println(cp1.toString());


        System.out.printf("\nSacando 200 reais de Afonso, com uma taxa de %.02f\n",c1.sacaValor(200));

        System.out.println(c1.toString());
    }
}
